import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CampPlace } from 'app/Models/campPlace.model';
import { CampPlaceFilterDto } from 'app/Models/campPlaceFilterDto';
import { Page } from 'app/Models/page';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CampPlaceService {

  apiurl = "http://localhost:8098/";

  constructor(private httpClient: HttpClient) {}

  addCampPlace(campPlace: CampPlace, file: File[]) {
    const headers = new HttpHeaders().set('Content-Type', 'multipart/form-data');
    return this.httpClient.post(this.apiurl + 'campPlace', this.convertCampPlaceToFormData(campPlace, file));
  }

  getAllCampPlace() {
    return this.httpClient.get<CampPlace[]>(this.apiurl + 'campPlace');
  }

  getTop5CampPlace() {
    return this.httpClient.get<CampPlace[]>(this.apiurl + 'campPlace/getTop5CampPlace');
  }

  getCampPlaceCount() {
    return this.httpClient.get<number>(this.apiurl + 'campPlace/campPlacesCount');
  }

  getCampPlaceCategories() {
    return this.httpClient.get<string[]>(this.apiurl + 'campPlace/categories');
  }

  getState() {
    return this.httpClient.get<string[]>(this.apiurl + 'api/campPlace/state');
  }

  convertCampPlaceToFormData(campPlace: CampPlace, files: File[]): FormData {
    const formData = new FormData();
    formData.append('idCampPlace', campPlace.idCampPlace.toString());
    formData.append('name', campPlace.name);
    formData.append('tel', campPlace.tel.toString());
    formData.append('email', campPlace.email);
    formData.append('address', campPlace.address);
    formData.append('category', campPlace.category);
    formData.append('state', campPlace.state);
    formData.append('description', campPlace.description);
    formData.append('longitude', campPlace.longitude.toString());
    formData.append('latitude', campPlace.latitude.toString());

    for (let i = 0; i < files.length; i++) {
      formData.append('images[' + i + ']', files[i], files[i].name);
    }
    return formData;
  }

  getFilteredCamPlace(campPlaceFilterDto: CampPlaceFilterDto, page: number, size: number): Observable<Page<CampPlace>> {
    let params = new HttpParams();
    if (campPlaceFilterDto.categories && campPlaceFilterDto.categories.length > 0) {
      params = params.append('categories', campPlaceFilterDto.categories.join(','));
    }
    if (campPlaceFilterDto.states && campPlaceFilterDto.states.length > 0) {
      params = params.append('states', campPlaceFilterDto.states.join(','));
    }
    params = params.append('page', page.toString());
    params = params.append('size', size.toString());
    params = params.append('sort', campPlaceFilterDto.sort);
    params = params.append('search', campPlaceFilterDto.searchTerm);

    return this.httpClient.get<Page<CampPlace>>(this.apiurl + 'api/campPlace/filteredCampPlaces', { params })
      .pipe(
        catchError(this.handleError)
      );
  }

  private handleError(error: any): Observable<never> {
    console.error('An error occurred:', error);
    return throwError('Something went wrong; please try again later.');
  }

  getCampPlaceByCategory(category: any) {
    return this.httpClient.get<CampPlace>(this.apiurl + 'campPlace/getSimilaireCampPlace/' + category);
  }

  getCampPlaceById(idCampPlace: any) {
    return this.httpClient.get<CampPlace>(this.apiurl + 'campPlace/' + idCampPlace);
  }

  deleteCampPlace(id: any) {
    return this.httpClient.delete<string[]>(this.apiurl + 'campPlace/' + id);
  }

  updateCampPlace(campPlace: CampPlace, file: File[]) {
    const headers = new HttpHeaders().set('Content-Type', 'multipart/form-data');
    return this.httpClient.put(this.apiurl + 'campPlace', this.convertCampPlaceToFormData(campPlace, file));
  }

  getCampPlacesSelect() {
    return this.httpClient.get<{ idCampPlace: any, name: any }>(this.apiurl + 'campPlace/getCampPlaceForSelect');
  }
}

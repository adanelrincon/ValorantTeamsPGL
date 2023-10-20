import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { TeamUpdatePage } from './team-update/team-update.page';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'team',
    loadChildren: () => import('./team/team.module').then( m => m.TeamPageModule)
  },
  {
    path: 'team-add',
    loadChildren: () => import('./team-add/team-add.module').then( m => m.TeamAddPageModule)
  },
  {
    path: 'team-update/:id',
    loadChildren: () => import('./team-update/team-update.module').then( m => m.TeamUpdatePageModule)
  },
  {
    path: 'team-update/:id',
    component: TeamUpdatePage,
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

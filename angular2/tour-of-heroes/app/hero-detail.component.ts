import {Component} from 'angular2/core';
import {Hero} from './hero';

@Component({
	selector: 'my-hero-detail',
	template: `
		<div *ngIf="hero">
	    	<h2>{{hero.name}} details!</h2>
	    	<div><label>id: </label>{{hero.id}}</div>
	    	<div>
	    		<label>name: </label>{{hero.name}}
	    		<div><input [(ngModel)]="hero.name" placeholder="name"></div> 
	    	</div>
    	</div>
    	`,
  	inputs: ['hero']
})

export class HeroDetailComponent {
	public hero: Hero;
}
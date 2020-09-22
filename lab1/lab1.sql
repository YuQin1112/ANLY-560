use sakila;

select film.film_id, film.title, category.category_id, category.name from film

inner join film_category 
on film.film_id = film_category.film_id

inner join category 
on film_category.category_id = category.category_id

# SQL  - write the appropriate SQL commands in a single SQL script file to answer the following question.  Use the Sakila database.
# Display the first and last names as well as the address (street and city) of all staff members.

use sakila;
select staff.first_name, staff.last_name, address.address, city.city from staff

inner join address
on staff.address_id = address.address_id

inner join city
on address.city_id = city.city_id

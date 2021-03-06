import csv
import pymysql

db = pymysql.connect("localhost", "YuQin","Qy319223", "sakila")
cursor = db.cursor()

sql = """
select staff.first_name, staff.last_name, address.address, city.city from staff

inner join address
on staff.address_id = address.address_id

inner join city
on address.city_id = city.city_id
"""

cursor.execute(sql)
rst = cursor.fetchall()

with open('exam1_Q5.csv', 'w', newline='') as csvfile:
    writer = csv.writer(csvfile, delimiter=',')

    for row in rst:
        writer.writerow(row)

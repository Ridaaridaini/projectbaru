select
	biodata.*,
	position.name
	
from biodata right join employee
	on biodata_id = employee.biodata_id
right join employee_position
	on employee.id = employee_position.employee_id
right join position
	on employee_position.position_id = position.id
	
where employee.status is null
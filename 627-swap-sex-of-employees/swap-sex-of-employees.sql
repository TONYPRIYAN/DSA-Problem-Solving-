# Write your MySQL query statement below
Update salary set sex = 
case sex
    when 'f' then 'm'
    else 'f'
end;
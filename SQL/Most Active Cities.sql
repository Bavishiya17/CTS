SELECT u.city,
       COUNT(DISTINCT r.user_id) AS users_count
FROM Users u
JOIN Registrations r
ON u.user_id = r.user_id
GROUP BY u.city
ORDER BY users_count DESC
LIMIT 5;
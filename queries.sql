--Part 1
--
--Part 2
-- SELECT * FROM `employer` where `location`="St. Louis City."
  SELECT name
  FROM employer WHERE location = "St. Louis City";
-- SELECT * FROM `employer` where `location`="Chicago"
--Part 3
-- DROP TABLE `event`
   DROP
   TABLE job;
--Part 4


SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
                WHERE job_skills.jobs_id IS NOT NULL
                ORDER BY name ASC;


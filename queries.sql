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


SELECT * FROM skill
LEFT JOIN job_skills ON skill.id job_skills.skills_id|job_skills.skills_id skill.id
                WHERE job_skills.jobs_id IS NOT NULL
                ORDER BY ASC;


"SELECT\\s+\\*\\s+FROM\\s+skill" +
                "\\s*(LEFT|INNER)?\\s+JOIN\\s+job_skills\\s+ON\\s+(skill.id\\s+=\\s+job_skills.skills_id|job_skills.skills_id\\s+=\\s+skill.id)" +
                "(\\s*WHERE\\s+job_skills.jobs_id\\s+IS\\s+NOT\\s+NULL)?" +
                "\\s*ORDER\\s+BY\\s+name\\s+ASC;"
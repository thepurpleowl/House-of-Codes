# Contribution

Following Platform Folders are present in the repo.  
      - HackerEarth    
      - HackerRank   
      - CodeChef    
      - CodeForce    
      - SPOJ  
      - OpenKattis   
In case of new platform, please add the platform to the list and create a new subdirectory with that platform name. 

*Please once check the repo directory structure, rest would be intuitive.* 

------------------

PRs would be accepted only if the following guidelines are followed.

DOs
-------
1. Whenever you add a code in any subdirectory, update the README of that specific directory with the problem link.
2. If you think there is a mistake OR you've a better/alternate solution, create an issue, assign to self, and raise a PR.
3. Raise a new issue, assign to self, and implement for new tasks.
4. Nomeclature of files should be as follows   
    **(PROBLEM_CODE)\_(EVENT_CODE).(FILE_TYPE)**
    
    For example [Split Stones](https://www.codechef.com/LTIME62B/problems/SPLST) problem the file name should be     
    **SPLST\_LTIME62B.java**  
    
    Problem code, problem description and event code can be found on problem page. In case of practice question/ no event, event code chould be NE OR left blank : NO_EVENT. For example
    **(PROBLEM_CODE)\_NE.(FILE_TYPE)** / **(PROBLEM_CODE).(FILE_TYPE)**
5. Code is maintained with [Codacy](https://app.codacy.com/gh/thepurpleowl/House-of-Codes/dashboard?branch=master). Please check for [issues](https://app.codacy.com/gh/thepurpleowl/House-of-Codes/issues/index?bid=20499451) raised by your PR and try to mitigate those. You can do it with same PR; no need to raise another PR.

Suggestions
-----------
1. Keep commit messages specific to an issue. Enables reviewer to review the PR efficiently. For example, if wokring on issue #34, consider a commit message like -  
    **Issue #34: Add xyz algo**

DON'Ts
-------
1. Don't raise a PR with a solution if the competition with the problem is still going on.  
3. Make sure the problem haven't been solved yet. If it's already present, please don't add a duplicate.
4. Only algorithm implementations will be accepted, including pseudo code or theoretical resources are not the objective of this repo.

------------------
Note
------------------
There were a few issue marked as `collective_issue`. A `collective_issue` represents a whole class of tasks (issues) and are broad in nature. They were added for visibility to tasks that would be missed otherwise. For example -
- One might be interested in fixing SAST scan alerts for only python language (related to `colletive_issue`: [Remove SAST scan issues](https://github.com/thepurpleowl/House-of-Codes/issues/43)).
- One might be interested in adding string search algos (related to `colletive_issue`: [ Add common algos in Basics folder](https://github.com/thepurpleowl/House-of-Codes/issues/8)).

*Removing `collective_issues` to avoid confusion.*

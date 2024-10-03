# House-of-Codes
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://lbesson.mit-license.org/)
[![Open Source Love png1](https://badges.frapsoft.com/os/v1/open-source.png?v=103)](https://github.com/ellerbrock/open-source-badges/)
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/8fb0ad3b49e849f194ffdf8d64a0ecdc)](https://www.codacy.com/gh/thepurpleowl/House-of-Codes/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=thepurpleowl/House-of-Codes&amp;utm_campaign=Badge_Grade)  

<!-- 
[![forthebadge](https://forthebadge.com/images/badges/powered-by-coffee.svg)](https://forthebadge.com)
[![ForTheBadge built-with-love](http://ForTheBadge.com/images/badges/built-with-love.svg)](https://GitHub.com/Naereen/)

https://github.com/dwyl/repo-badges
https://github.com/Naereen/badges
-->

A repository to collect the solutions to all Competitive Programming problems (along with the competition info) across platforms and languages, only to be used as reference/practice. Main objective of this beginner-freindly repo is to help beginners to collaborate, to get acquainted with the processes of opensource, and enjoy Hacktoberfest. Broader goal is to create a dataset of programming problems across languages to be used with LLMs.

Example of one use case of a such dataset could be to optimize existing code with prompting strategy -
### I/P Prompt
```
You are a helpful assistant. Given an inefficient implementation of bubble sort, optimize the implementation.

Inefficient Implementation:
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

Efficient Implementation:

```
### O/P
```
def optimized_bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr
```

## Hacktoberfest
Happy Hacktoberfest! I hope that you find this project interesting and that some issues offer a good learning experience! Help of any kind would be greatly appreciated.

- You can check out the [issues page](https://github.com/thepurpleowl/House-of-Codes/issues) for anything that interests you.
- Additionally, please check out [contributing](https://github.com/thepurpleowl/House-of-Codes/blob/master/CONTRIBUTING.md) for some information on how you can contribute to this project.

Code scan is maintained with [Codacy](https://app.codacy.com/gh/thepurpleowl/House-of-Codes/dashboard?branch=master) !!

**Please 'star' this repo to help other beginners like you to find this repo and complete Hacktoberfest challenge.**

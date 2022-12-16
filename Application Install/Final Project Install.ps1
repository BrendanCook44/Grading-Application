#Creating Directories:

#Path Of Where Script Is Launched From:
$ScriptPath = $MyInvocation.MyCommand.Path

#Finds Desktop Path:
$DesktopPath = [System.Environment]::GetFolderPath([System.Environment+SpecialFolder]::Desktop)

#Path Up To Install Folder:
$FullPath = Split-Path $ScriptPath

#Create New Folder Called Final Project:
New-Item -Path "C:\FinalProject" -itemType Directory

#Copying Data To Directories:
Copy-Item -Path  "$FullPath\FinalProject.jar" -Destination "$DesktopPath" -Force -Verbose
Copy-Item -Path  "$FullPath\Homework.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\Tests.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\Students.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\Grades.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\EditedAssignment.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\EditedStudent.csv" -Destination "C:\FinalProject" -Force -Verbose
Copy-Item -Path  "$FullPath\EditedGrade.csv" -Destination "C:\FinalProject" -Force -Verbose

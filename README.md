# RestaurantManager

<b>How To contribute:</b>  
Download and install git bash from here: https://gitforwindows.org/  
Run git bash  
Use cd to browse to a location you want the project to be stored  
git clone https://github.com/Xanawatt/RestaurantManager.git  
cd RestaurantManager



<b>Verify that you can push to the repository:</b> 
Before you can push to the repository, you need to be added to the verified collaborators list. DM me (Mark Schneider) on GroupMe with your GitHub username
Perform a git pull to get changes from other members: git pull  
Create a test text file with your name in it: echo "Your name here" >> your_name_here.txt  
Add your file to the staging area: git add your_name_here.txt  
Commit the changes in the staging area: git commit -m "Initial Commit: your name here"  
Push your commit to the server: git push  

In the future when making changes to code, before you start working on code, do a git pull. After pulling do a git checkout yourname-branch to switch to your working branch. Perform a git merge master to merge the most recent changes into your code. If there are conflicts, dm me (Mark Schneider) on GroupMe and we can work out the conflicts together. After the code has been merged into your branch, you can then begin to modify your code. Do commits and push frequently so that you can quickly revert if something goes wrong. When you feel that your feature has been fleshed out completly, dm me (Mark Schneider) on GroupMe so I can review your changes and merge it into the main codebase.

<b>If any of the steps mentioned above don't work (or if you're confused on how to perform them), please dm me (Mark Schneider) on GroupMe immediatly<b>

<b>TODO - read this and pick something</b>
This is not an exhaustive list, please add to this as you think of additional things to add

- GUI (It looks like Grant is doing this)

- Base classes (Garrett)
	- Menu (contains menu items)
		- Menu item
			- Variables: price, serving size, type, gluten free
			- Food item (type of Menu item)
			- Drink item (type of Menu item)
				
	- Table
		- Variables: Number of seats, occupied (true/false), assigned waiter
		
	- Check
		- Variables: Total price, date, time, paid with, waiter name
		
	- Employee
		- Variables: Name, employee ID, age, wage/salary
		- Manager (type of Employee)
		- Waiter (type of Employee)
		- Chef (type of Employee)

- Functionality
	- Check system (create new check, add items to check, discount check if necessary, close check when payment is received)
	
	- Inventory system (shows how much of an item we have, how much it costs to order more, etc) (Mark)
		- Inventory item
			- Variables: Name, item ID, quantity of item, price to stock
			- Parent of the MenuItem class
			
	
	- Table utilization tracking (a GUI that shows which tables are in use)
		- Probably a seperate GUI that spawns off the first one
	
	- 
- 

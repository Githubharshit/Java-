def getdate_time():
    import datetime
    now = datetime.datetime.now()
    return now.strftime("%m/%d/%Y, %H:%M:%S")


print("WELCOME TO THE FITNESS PROGRESS TRACKER\n")
choice1 = int(input("""Press 1: To add a new client
Press 2: For an existing client """))

match choice1:
    case 1:
        name = input("Enter the Name: ")
        with open(f"{name}_diet.txt", "w") as f:
            f.write("")
        with open(f"{name}_workout.txt", "w") as f:
            f.write("")

        print("Client added!!")

    case 2:
        name = input("Enter the name of the client: ")
        choice2 = int(input("Press 1: To Lock the details\n"
                            "Press 2: To Retrieve the details "))

        match choice2:
            case 1:
                choice3 = int(input("\nPress 1: To lock Diet details\n"
                                    "Press 2: To lock Workout details "))

                match choice3:
                    case 1:
                        date_time = getdate_time()
                        diet = input("Enter the diet taken by the client: ")
                        with open(f"{name}_diet.txt", "a") as f:
                            f.write(f"Date & Time of meal: [{date_time}], Meal Taken: {diet}")

                        print("Diet recorded!!")

                    case 2:
                        date_time = getdate_time()
                        workout = input("Enter the workout done by the client: ")
                        with open(f"{name}_workout.txt", "a") as f:
                            f.write(f"Date & Time of Workout: [{date_time}], Workout Done: {workout}")

                        print("Workout recorded!!")

            case 2:
                choice4 = int(input("\nPress 1: To Retrieve Diet details\n"
                                    "Press 2: To Retrieve Workout details "))

                match choice4:
                    case 1:
                        print(f"Diet details of {name}: ")
                        with open(f"{name}_diet.txt", "r") as f:
                            print(f.read())

                    case 2:
                        print(f"Workout details of {name}: ")
                        with open(f"{name}_workout.txt", "r") as f:
                            print(f.read())




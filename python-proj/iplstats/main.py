from iplstats.iplstats_service import *

if __name__ == '__main__':
    #add_team_details()
    team_names = get_unique_team_labels()
    print(team_names)

    team_total_amount = get_team_total_amount()
    for team in team_total_amount:
        print(f"{team['teamLabel']} =>  {team['totalAmount']}")

from iplstats.file_reader_util import read_json_file
from iplstats.db_service import *


def add_team_details():
    team_details = read_json_file("../data/ipl_2020_data.json")
    load_data(team_details)


def get_unique_team_labels():
    team_names = find_team_names()
    return [team['label'] for team in team_names]


def get_team_total_amount():
    team_amount = []
    for team in find_team_total_amount():
        team_amount.append({"teamLabel": team['team_label'], "totalAmount": team['total_amount']})
    return team_amount

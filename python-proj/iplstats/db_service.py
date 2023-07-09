import pymongo


myclient = pymongo.MongoClient("mongodb+srv://dbuser:dbuser@cluster0.by94adv.mongodb.net/?retryWrites=true&w=majority")
mydb = myclient["iplstats"]
collection_name = "team_details"


def load_data(data):
    collection = mydb[collection_name]
    collection.insert_many(data)


def find_team_names():
    collection = mydb[collection_name]
    return collection.find({}, {'label': 1})


def find_team_total_amount():
    collections = mydb[collection_name]

    return collections.aggregate([
       {
            "$unwind": "$players"
       },
       {
             "$group": {"_id": "$label", "total_amount": {"$sum": "$players.amount"}}
       },
       {
            "$project": {"team_label": '$_id', "_id": 0, "total_amount": 1}
       }
    ])


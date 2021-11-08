import pandas as ps

path = "melb_data.csv"

#store data in a specific dataframe
melb_data = ps.read_csv(path)

#print summary of the data
print(melb_data.describe())


print('fine')
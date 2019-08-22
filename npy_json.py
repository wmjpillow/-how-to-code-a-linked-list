# Transfer Python .npy file to json file for JS


import numpy as np
import pandas as pd
import json


df=pd.DataFrame(np.load("/Users/wangmeijie/Smile.npy"))

df.T.to_json("Smile.json")
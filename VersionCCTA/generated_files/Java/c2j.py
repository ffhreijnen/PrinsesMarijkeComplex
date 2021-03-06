# Generated for use with c2j in ignition.
from project.myFuns import valueOf, writeTo, writeToState
# input all actuator signals
def readTags(model):
  model.M_Barrier_HW_Barrier_BVH_East_Q_Open_ = valueOf("Barrier_HW_Barrier_BVH_East_Q_Open")
  model.M_Barrier_HW_Barrier_BVH_East_Q_Close_ = valueOf("Barrier_HW_Barrier_BVH_East_Q_Close")
  model.M_Barrier_HW_TL_BNH_East_Q_Red_ = valueOf("Barrier_HW_TL_BNH_East_Q_Red")
  model.M_Barrier_HW_TL_BNH_East_Q_Green_ = valueOf("Barrier_HW_TL_BNH_East_Q_Green")
  model.M_Barrier_HW_TL_BNH_West_Q_Red_ = valueOf("Barrier_HW_TL_BNH_West_Q_Red")
  model.M_Barrier_HW_TL_BNH_West_Q_Green_ = valueOf("Barrier_HW_TL_BNH_West_Q_Green")
  model.M_Barrier_HW_TL_BVH_East_Q_Red_ = valueOf("Barrier_HW_TL_BVH_East_Q_Red")
  model.M_Barrier_HW_TL_BVH_East_Q_Green_ = valueOf("Barrier_HW_TL_BVH_East_Q_Green")
  model.M_Barrier_HW_TL_BVH_West_Q_Red_ = valueOf("Barrier_HW_TL_BVH_West_Q_Red")
  model.M_Barrier_HW_TL_BVH_West_Q_Green_ = valueOf("Barrier_HW_TL_BVH_West_Q_Green")
  model.M_HW_Wh_HighWater_ = valueOf("HW_Wh_HighWater")
  model.M_North_HW_EnteringTL_BNH_East_Q_Red_ = valueOf("North_HW_EnteringTL_BNH_East_Q_Red")
  model.M_North_HW_EnteringTL_BNH_East_Q_Green_ = valueOf("North_HW_EnteringTL_BNH_East_Q_Green")
  model.M_North_HW_EnteringTL_BNH_East_Q_RedRed_ = valueOf("North_HW_EnteringTL_BNH_East_Q_RedRed")
  model.M_North_HW_EnteringTL_BNH_West_Q_Red_ = valueOf("North_HW_EnteringTL_BNH_West_Q_Red")
  model.M_North_HW_EnteringTL_BNH_West_Q_Green_ = valueOf("North_HW_EnteringTL_BNH_West_Q_Green")
  model.M_North_HW_EnteringTL_BNH_West_Q_RedRed_ = valueOf("North_HW_EnteringTL_BNH_West_Q_RedRed")
  model.M_North_HW_EnteringTL_BVH_East_Q_Red_ = valueOf("North_HW_EnteringTL_BVH_East_Q_Red")
  model.M_North_HW_EnteringTL_BVH_East_Q_Green_ = valueOf("North_HW_EnteringTL_BVH_East_Q_Green")
  model.M_North_HW_EnteringTL_BVH_East_Q_RedRed_ = valueOf("North_HW_EnteringTL_BVH_East_Q_RedRed")
  model.M_North_HW_EnteringTL_BVH_West_Q_Red_ = valueOf("North_HW_EnteringTL_BVH_West_Q_Red")
  model.M_North_HW_EnteringTL_BVH_West_Q_Green_ = valueOf("North_HW_EnteringTL_BVH_West_Q_Green")
  model.M_North_HW_EnteringTL_BVH_West_Q_RedRed_ = valueOf("North_HW_EnteringTL_BVH_West_Q_RedRed")
  model.M_North_HW_Gate_BNH_East_Q_Open_ = valueOf("North_HW_Gate_BNH_East_Q_Open")
  model.M_North_HW_Gate_BNH_East_Q_Close_ = valueOf("North_HW_Gate_BNH_East_Q_Close")
  model.M_North_HW_Gate_BNH_West_Q_Open_ = valueOf("North_HW_Gate_BNH_West_Q_Open")
  model.M_North_HW_Gate_BNH_West_Q_Close_ = valueOf("North_HW_Gate_BNH_West_Q_Close")
  model.M_North_HW_Gate_BVH_East_Q_Open_ = valueOf("North_HW_Gate_BVH_East_Q_Open")
  model.M_North_HW_Gate_BVH_East_Q_Close_ = valueOf("North_HW_Gate_BVH_East_Q_Close")
  model.M_North_HW_Gate_BVH_West_Q_Open_ = valueOf("North_HW_Gate_BVH_West_Q_Open")
  model.M_North_HW_Gate_BVH_West_Q_Close_ = valueOf("North_HW_Gate_BVH_West_Q_Close")
  model.M_North_HW_LeavingTL_BNH_East_Q_Red_ = valueOf("North_HW_LeavingTL_BNH_East_Q_Red")
  model.M_North_HW_LeavingTL_BNH_East_Q_Green_ = valueOf("North_HW_LeavingTL_BNH_East_Q_Green")
  model.M_North_HW_LeavingTL_BNH_West_Q_Red_ = valueOf("North_HW_LeavingTL_BNH_West_Q_Red")
  model.M_North_HW_LeavingTL_BNH_West_Q_Green_ = valueOf("North_HW_LeavingTL_BNH_West_Q_Green")
  model.M_North_HW_LeavingTL_BVH_East_Q_Red_ = valueOf("North_HW_LeavingTL_BVH_East_Q_Red")
  model.M_North_HW_LeavingTL_BVH_East_Q_Green_ = valueOf("North_HW_LeavingTL_BVH_East_Q_Green")
  model.M_North_HW_LeavingTL_BVH_West_Q_Red_ = valueOf("North_HW_LeavingTL_BVH_West_Q_Red")
  model.M_North_HW_LeavingTL_BVH_West_Q_Green_ = valueOf("North_HW_LeavingTL_BVH_West_Q_Green")
  model.M_North_HW_Paddle_BNH_East_Q_Open_ = valueOf("North_HW_Paddle_BNH_East_Q_Open")
  model.M_North_HW_Paddle_BNH_East_Q_Close_ = valueOf("North_HW_Paddle_BNH_East_Q_Close")
  model.M_North_HW_Paddle_BNH_West_Q_Open_ = valueOf("North_HW_Paddle_BNH_West_Q_Open")
  model.M_North_HW_Paddle_BNH_West_Q_Close_ = valueOf("North_HW_Paddle_BNH_West_Q_Close")
  model.M_North_HW_Paddle_BVH_East_Q_Open_ = valueOf("North_HW_Paddle_BVH_East_Q_Open")
  model.M_North_HW_Paddle_BVH_East_Q_Close_ = valueOf("North_HW_Paddle_BVH_East_Q_Close")
  model.M_North_HW_Paddle_BVH_West_Q_Open_ = valueOf("North_HW_Paddle_BVH_West_Q_Open")
  model.M_North_HW_Paddle_BVH_West_Q_Close_ = valueOf("North_HW_Paddle_BVH_West_Q_Close")
  model.M_South_HW_EnteringTL_BNH_East_Q_Red_ = valueOf("South_HW_EnteringTL_BNH_East_Q_Red")
  model.M_South_HW_EnteringTL_BNH_East_Q_Green_ = valueOf("South_HW_EnteringTL_BNH_East_Q_Green")
  model.M_South_HW_EnteringTL_BNH_East_Q_RedRed_ = valueOf("South_HW_EnteringTL_BNH_East_Q_RedRed")
  model.M_South_HW_EnteringTL_BNH_West_Q_Red_ = valueOf("South_HW_EnteringTL_BNH_West_Q_Red")
  model.M_South_HW_EnteringTL_BNH_West_Q_Green_ = valueOf("South_HW_EnteringTL_BNH_West_Q_Green")
  model.M_South_HW_EnteringTL_BNH_West_Q_RedRed_ = valueOf("South_HW_EnteringTL_BNH_West_Q_RedRed")
  model.M_South_HW_EnteringTL_BVH_East_Q_Red_ = valueOf("South_HW_EnteringTL_BVH_East_Q_Red")
  model.M_South_HW_EnteringTL_BVH_East_Q_Green_ = valueOf("South_HW_EnteringTL_BVH_East_Q_Green")
  model.M_South_HW_EnteringTL_BVH_East_Q_RedRed_ = valueOf("South_HW_EnteringTL_BVH_East_Q_RedRed")
  model.M_South_HW_EnteringTL_BVH_West_Q_Red_ = valueOf("South_HW_EnteringTL_BVH_West_Q_Red")
  model.M_South_HW_EnteringTL_BVH_West_Q_Green_ = valueOf("South_HW_EnteringTL_BVH_West_Q_Green")
  model.M_South_HW_EnteringTL_BVH_West_Q_RedRed_ = valueOf("South_HW_EnteringTL_BVH_West_Q_RedRed")
  model.M_South_HW_Gate_BNH_East_Q_Open_ = valueOf("South_HW_Gate_BNH_East_Q_Open")
  model.M_South_HW_Gate_BNH_East_Q_Close_ = valueOf("South_HW_Gate_BNH_East_Q_Close")
  model.M_South_HW_Gate_BNH_West_Q_Open_ = valueOf("South_HW_Gate_BNH_West_Q_Open")
  model.M_South_HW_Gate_BNH_West_Q_Close_ = valueOf("South_HW_Gate_BNH_West_Q_Close")
  model.M_South_HW_Gate_BVH_East_Q_Open_ = valueOf("South_HW_Gate_BVH_East_Q_Open")
  model.M_South_HW_Gate_BVH_East_Q_Close_ = valueOf("South_HW_Gate_BVH_East_Q_Close")
  model.M_South_HW_Gate_BVH_West_Q_Open_ = valueOf("South_HW_Gate_BVH_West_Q_Open")
  model.M_South_HW_Gate_BVH_West_Q_Close_ = valueOf("South_HW_Gate_BVH_West_Q_Close")
  model.M_South_HW_LeavingTL_BNH_East_Q_Red_ = valueOf("South_HW_LeavingTL_BNH_East_Q_Red")
  model.M_South_HW_LeavingTL_BNH_East_Q_Green_ = valueOf("South_HW_LeavingTL_BNH_East_Q_Green")
  model.M_South_HW_LeavingTL_BNH_West_Q_Red_ = valueOf("South_HW_LeavingTL_BNH_West_Q_Red")
  model.M_South_HW_LeavingTL_BNH_West_Q_Green_ = valueOf("South_HW_LeavingTL_BNH_West_Q_Green")
  model.M_South_HW_LeavingTL_BVH_East_Q_Red_ = valueOf("South_HW_LeavingTL_BVH_East_Q_Red")
  model.M_South_HW_LeavingTL_BVH_East_Q_Green_ = valueOf("South_HW_LeavingTL_BVH_East_Q_Green")
  model.M_South_HW_LeavingTL_BVH_West_Q_Red_ = valueOf("South_HW_LeavingTL_BVH_West_Q_Red")
  model.M_South_HW_LeavingTL_BVH_West_Q_Green_ = valueOf("South_HW_LeavingTL_BVH_West_Q_Green")
  model.M_South_HW_Paddle_BNH_East_Q_Open_ = valueOf("South_HW_Paddle_BNH_East_Q_Open")
  model.M_South_HW_Paddle_BNH_East_Q_Close_ = valueOf("South_HW_Paddle_BNH_East_Q_Close")
  model.M_South_HW_Paddle_BNH_West_Q_Open_ = valueOf("South_HW_Paddle_BNH_West_Q_Open")
  model.M_South_HW_Paddle_BNH_West_Q_Close_ = valueOf("South_HW_Paddle_BNH_West_Q_Close")
  model.M_South_HW_Paddle_BVH_East_Q_Open_ = valueOf("South_HW_Paddle_BVH_East_Q_Open")
  model.M_South_HW_Paddle_BVH_East_Q_Close_ = valueOf("South_HW_Paddle_BVH_East_Q_Close")
  model.M_South_HW_Paddle_BVH_West_Q_Open_ = valueOf("South_HW_Paddle_BVH_West_Q_Open")
  model.M_South_HW_Paddle_BVH_West_Q_Close_ = valueOf("South_HW_Paddle_BVH_West_Q_Close")

# write all sensor signals
def writeTags(model):
  writeTo("Barrier_HW_Barrier_BVH_East_Open", model.M_Barrier_HW_Barrier_BVH_East_Open_)
  writeTo("Barrier_HW_Barrier_BVH_East_Closed", model.M_Barrier_HW_Barrier_BVH_East_Closed_)
  writeTo("Barrier_HW_TL_BNH_East_Red", model.M_Barrier_HW_TL_BNH_East_Red_)
  writeTo("Barrier_HW_TL_BNH_East_Green", model.M_Barrier_HW_TL_BNH_East_Green_)
  writeTo("Barrier_HW_TL_BNH_West_Red", model.M_Barrier_HW_TL_BNH_West_Red_)
  writeTo("Barrier_HW_TL_BNH_West_Green", model.M_Barrier_HW_TL_BNH_West_Green_)
  writeTo("Barrier_HW_TL_BVH_East_Red", model.M_Barrier_HW_TL_BVH_East_Red_)
  writeTo("Barrier_HW_TL_BVH_East_Green", model.M_Barrier_HW_TL_BVH_East_Green_)
  writeTo("Barrier_HW_TL_BVH_West_Red", model.M_Barrier_HW_TL_BVH_West_Red_)
  writeTo("Barrier_HW_TL_BVH_West_Green", model.M_Barrier_HW_TL_BVH_West_Green_)
  writeTo("North_HW_EnteringTL_BNH_East_Red", model.M_North_HW_EnteringTL_BNH_East_Red_)
  writeTo("North_HW_EnteringTL_BNH_East_Green", model.M_North_HW_EnteringTL_BNH_East_Green_)
  writeTo("North_HW_EnteringTL_BNH_East_RedRed", model.M_North_HW_EnteringTL_BNH_East_RedRed_)
  writeTo("North_HW_EnteringTL_BNH_West_Red", model.M_North_HW_EnteringTL_BNH_West_Red_)
  writeTo("North_HW_EnteringTL_BNH_West_Green", model.M_North_HW_EnteringTL_BNH_West_Green_)
  writeTo("North_HW_EnteringTL_BNH_West_RedRed", model.M_North_HW_EnteringTL_BNH_West_RedRed_)
  writeTo("North_HW_EnteringTL_BVH_East_Red", model.M_North_HW_EnteringTL_BVH_East_Red_)
  writeTo("North_HW_EnteringTL_BVH_East_Green", model.M_North_HW_EnteringTL_BVH_East_Green_)
  writeTo("North_HW_EnteringTL_BVH_East_RedRed", model.M_North_HW_EnteringTL_BVH_East_RedRed_)
  writeTo("North_HW_EnteringTL_BVH_West_Red", model.M_North_HW_EnteringTL_BVH_West_Red_)
  writeTo("North_HW_EnteringTL_BVH_West_Green", model.M_North_HW_EnteringTL_BVH_West_Green_)
  writeTo("North_HW_EnteringTL_BVH_West_RedRed", model.M_North_HW_EnteringTL_BVH_West_RedRed_)
  writeTo("North_HW_EqualWaterSensor_BNH_Equal", model.M_North_HW_EqualWaterSensor_BNH_Equal_)
  writeTo("North_HW_EqualWaterSensor_BVH_Equal", model.M_North_HW_EqualWaterSensor_BVH_Equal_)
  writeTo("North_HW_Gate_BNH_East_Open", model.M_North_HW_Gate_BNH_East_Open_)
  writeTo("North_HW_Gate_BNH_East_Closed", model.M_North_HW_Gate_BNH_East_Closed_)
  writeTo("North_HW_Gate_BNH_West_Open", model.M_North_HW_Gate_BNH_West_Open_)
  writeTo("North_HW_Gate_BNH_West_Closed", model.M_North_HW_Gate_BNH_West_Closed_)
  writeTo("North_HW_Gate_BVH_East_Open", model.M_North_HW_Gate_BVH_East_Open_)
  writeTo("North_HW_Gate_BVH_East_Closed", model.M_North_HW_Gate_BVH_East_Closed_)
  writeTo("North_HW_Gate_BVH_West_Open", model.M_North_HW_Gate_BVH_West_Open_)
  writeTo("North_HW_Gate_BVH_West_Closed", model.M_North_HW_Gate_BVH_West_Closed_)
  writeTo("North_HW_LeavingTL_BNH_East_Red", model.M_North_HW_LeavingTL_BNH_East_Red_)
  writeTo("North_HW_LeavingTL_BNH_East_Green", model.M_North_HW_LeavingTL_BNH_East_Green_)
  writeTo("North_HW_LeavingTL_BNH_West_Red", model.M_North_HW_LeavingTL_BNH_West_Red_)
  writeTo("North_HW_LeavingTL_BNH_West_Green", model.M_North_HW_LeavingTL_BNH_West_Green_)
  writeTo("North_HW_LeavingTL_BVH_East_Red", model.M_North_HW_LeavingTL_BVH_East_Red_)
  writeTo("North_HW_LeavingTL_BVH_East_Green", model.M_North_HW_LeavingTL_BVH_East_Green_)
  writeTo("North_HW_LeavingTL_BVH_West_Red", model.M_North_HW_LeavingTL_BVH_West_Red_)
  writeTo("North_HW_LeavingTL_BVH_West_Green", model.M_North_HW_LeavingTL_BVH_West_Green_)
  writeTo("North_HW_Paddle_BNH_East_Open", model.M_North_HW_Paddle_BNH_East_Open_)
  writeTo("North_HW_Paddle_BNH_East_Closed", model.M_North_HW_Paddle_BNH_East_Closed_)
  writeTo("North_HW_Paddle_BNH_West_Open", model.M_North_HW_Paddle_BNH_West_Open_)
  writeTo("North_HW_Paddle_BNH_West_Closed", model.M_North_HW_Paddle_BNH_West_Closed_)
  writeTo("North_HW_Paddle_BVH_East_Open", model.M_North_HW_Paddle_BVH_East_Open_)
  writeTo("North_HW_Paddle_BVH_East_Closed", model.M_North_HW_Paddle_BVH_East_Closed_)
  writeTo("North_HW_Paddle_BVH_West_Open", model.M_North_HW_Paddle_BVH_West_Open_)
  writeTo("North_HW_Paddle_BVH_West_Closed", model.M_North_HW_Paddle_BVH_West_Closed_)
  writeTo("South_HW_EnteringTL_BNH_East_Red", model.M_South_HW_EnteringTL_BNH_East_Red_)
  writeTo("South_HW_EnteringTL_BNH_East_Green", model.M_South_HW_EnteringTL_BNH_East_Green_)
  writeTo("South_HW_EnteringTL_BNH_East_RedRed", model.M_South_HW_EnteringTL_BNH_East_RedRed_)
  writeTo("South_HW_EnteringTL_BNH_West_Red", model.M_South_HW_EnteringTL_BNH_West_Red_)
  writeTo("South_HW_EnteringTL_BNH_West_Green", model.M_South_HW_EnteringTL_BNH_West_Green_)
  writeTo("South_HW_EnteringTL_BNH_West_RedRed", model.M_South_HW_EnteringTL_BNH_West_RedRed_)
  writeTo("South_HW_EnteringTL_BVH_East_Red", model.M_South_HW_EnteringTL_BVH_East_Red_)
  writeTo("South_HW_EnteringTL_BVH_East_Green", model.M_South_HW_EnteringTL_BVH_East_Green_)
  writeTo("South_HW_EnteringTL_BVH_East_RedRed", model.M_South_HW_EnteringTL_BVH_East_RedRed_)
  writeTo("South_HW_EnteringTL_BVH_West_Red", model.M_South_HW_EnteringTL_BVH_West_Red_)
  writeTo("South_HW_EnteringTL_BVH_West_Green", model.M_South_HW_EnteringTL_BVH_West_Green_)
  writeTo("South_HW_EnteringTL_BVH_West_RedRed", model.M_South_HW_EnteringTL_BVH_West_RedRed_)
  writeTo("South_HW_EqualWaterSensor_BNH_Equal", model.M_South_HW_EqualWaterSensor_BNH_Equal_)
  writeTo("South_HW_EqualWaterSensor_BVH_Equal", model.M_South_HW_EqualWaterSensor_BVH_Equal_)
  writeTo("South_HW_Gate_BNH_East_Open", model.M_South_HW_Gate_BNH_East_Open_)
  writeTo("South_HW_Gate_BNH_East_Closed", model.M_South_HW_Gate_BNH_East_Closed_)
  writeTo("South_HW_Gate_BNH_West_Open", model.M_South_HW_Gate_BNH_West_Open_)
  writeTo("South_HW_Gate_BNH_West_Closed", model.M_South_HW_Gate_BNH_West_Closed_)
  writeTo("South_HW_Gate_BVH_East_Open", model.M_South_HW_Gate_BVH_East_Open_)
  writeTo("South_HW_Gate_BVH_East_Closed", model.M_South_HW_Gate_BVH_East_Closed_)
  writeTo("South_HW_Gate_BVH_West_Open", model.M_South_HW_Gate_BVH_West_Open_)
  writeTo("South_HW_Gate_BVH_West_Closed", model.M_South_HW_Gate_BVH_West_Closed_)
  writeTo("South_HW_LeavingTL_BNH_East_Red", model.M_South_HW_LeavingTL_BNH_East_Red_)
  writeTo("South_HW_LeavingTL_BNH_East_Green", model.M_South_HW_LeavingTL_BNH_East_Green_)
  writeTo("South_HW_LeavingTL_BNH_West_Red", model.M_South_HW_LeavingTL_BNH_West_Red_)
  writeTo("South_HW_LeavingTL_BNH_West_Green", model.M_South_HW_LeavingTL_BNH_West_Green_)
  writeTo("South_HW_LeavingTL_BVH_East_Red", model.M_South_HW_LeavingTL_BVH_East_Red_)
  writeTo("South_HW_LeavingTL_BVH_East_Green", model.M_South_HW_LeavingTL_BVH_East_Green_)
  writeTo("South_HW_LeavingTL_BVH_West_Red", model.M_South_HW_LeavingTL_BVH_West_Red_)
  writeTo("South_HW_LeavingTL_BVH_West_Green", model.M_South_HW_LeavingTL_BVH_West_Green_)
  writeTo("South_HW_Paddle_BNH_East_Open", model.M_South_HW_Paddle_BNH_East_Open_)
  writeTo("South_HW_Paddle_BNH_East_Closed", model.M_South_HW_Paddle_BNH_East_Closed_)
  writeTo("South_HW_Paddle_BNH_West_Open", model.M_South_HW_Paddle_BNH_West_Open_)
  writeTo("South_HW_Paddle_BNH_West_Closed", model.M_South_HW_Paddle_BNH_West_Closed_)
  writeTo("South_HW_Paddle_BVH_East_Open", model.M_South_HW_Paddle_BVH_East_Open_)
  writeTo("South_HW_Paddle_BVH_East_Closed", model.M_South_HW_Paddle_BVH_East_Closed_)
  writeTo("South_HW_Paddle_BVH_West_Open", model.M_South_HW_Paddle_BVH_West_Open_)
  writeTo("South_HW_Paddle_BVH_West_Closed", model.M_South_HW_Paddle_BVH_West_Closed_)

# write all state values
def updateState(model):
  writeToState("North_Upstream_Gates_East_Degree", model.North_Upstream_Gates_East_Degree_)
  writeToState("North_Upstream_Gates_West_Degree", model.North_Upstream_Gates_West_Degree_)
  writeToState("North_Upstream_Paddles_East_Degree", model.North_Upstream_Paddles_East_Degree_)
  writeToState("North_Upstream_Paddles_West_Degree", model.North_Upstream_Paddles_West_Degree_)
  writeToState("North_Downstream_Gates_East_Degree", model.North_Downstream_Gates_East_Degree_)
  writeToState("North_Downstream_Gates_West_Degree", model.North_Downstream_Gates_West_Degree_)
  writeToState("North_Downstream_Paddles_East_Degree", model.North_Downstream_Paddles_East_Degree_)
  writeToState("North_Downstream_Paddles_West_Degree", model.North_Downstream_Paddles_West_Degree_)
  writeToState("North_Water_H_Chamber", model.North_Water_H_Chamber_)
  writeToState("South_Upstream_Gates_East_Degree", model.South_Upstream_Gates_East_Degree_)
  writeToState("South_Upstream_Gates_West_Degree", model.South_Upstream_Gates_West_Degree_)
  writeToState("South_Upstream_Paddles_East_Degree", model.South_Upstream_Paddles_East_Degree_)
  writeToState("South_Upstream_Paddles_West_Degree", model.South_Upstream_Paddles_West_Degree_)
  writeToState("South_Downstream_Gates_East_Degree", model.South_Downstream_Gates_East_Degree_)
  writeToState("South_Downstream_Gates_West_Degree", model.South_Downstream_Gates_West_Degree_)
  writeToState("South_Downstream_Paddles_East_Degree", model.South_Downstream_Paddles_East_Degree_)
  writeToState("South_Downstream_Paddles_West_Degree", model.South_Downstream_Paddles_West_Degree_)
  writeToState("South_Water_H_Chamber", model.South_Water_H_Chamber_)
  writeToState("Barrier_Barrier_Degree", model.Barrier_Barrier_Degree_)

# write all nonbool input values
def readNonBoolTags(model):

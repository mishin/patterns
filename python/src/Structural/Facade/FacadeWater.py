
# two of three classes the facade calls
class FacadeWater:

	waterIsBoiling = None

	def __init__(self) : 
		self.setWaterIsBoiling(False)

	def boilFacadeWater(self) :
		self.setWaterIsBoiling( True )
		return "water is boiling"

	def setWaterIsBoiling(self,isWaterBoiling) :
		self. waterIsBoiling = isWaterBoiling

	def getWaterIsBoiling(self) : 
		return self.waterIsBoiling

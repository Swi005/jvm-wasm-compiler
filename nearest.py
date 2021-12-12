from dataclasses import dataclass
from math import sqrt
import itertools
@dataclass
class Point:
    x:float
    y:float

origo = Point(0,0) #Point of comparison
n = 5 #Number of closest elems
ls = []#ls of all points minus point of comparison
def distance(p:Point)->float:
    return sqrt( pow(p.x-origo.x,2)+pow(p.y-origo.y,2))



sorted(ls,key=distance)
top5 = itertools.islice(ls, n)
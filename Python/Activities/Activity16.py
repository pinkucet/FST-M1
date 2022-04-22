class Car:
    
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color


    def accelerate(self):
        print(self.manufacturer+" "+self.model+" is running")

    def stop(self):
        print(self.manufacturer+" "+self.model+" has stopped")

c1 = Car("Toyota","Innova","2021","Manual","White")
c2 = Car("Honda","City","2021","Manual","White")
c3 = Car("Maruti","Swift","2021","Manual","White")
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()
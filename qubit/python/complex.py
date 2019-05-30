class Complex:
    """
    This class models a complex number
    """

    def __init__(self, real_number, imaginary_number):
        self.real_number = real_number
        self.imaginary_number = imaginary_number

    def module(self):
        return pow( pow(self.real_number, 2) + pow(self.imaginary_number, 2), 0.5)

    def get_complex_value(self):
        return str(self.real_number) + " + " + str(self.imaginary_number) + "i"

    def set_values(self, real_number, imaginary_number):
        self.real_number = real_number
        self.imaginary_number = imaginary_number
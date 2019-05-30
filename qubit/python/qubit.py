from random import randint


class Qubit:
    """
    This class models a qubit
    """

    def __init__(self, alpha, beta, value=1, is_observed=False):
        self.alpha = alpha
        self.beta = beta
        self.ket_zero = [1, 0]
        self.ket_one = [0, 1]
        self.value = value
        self.is_observed = is_observed

    def observe(self):
        if not self.is_observed:
            if pow(self.alpha.module(), 2) < pow(self.beta.module(), 2):
                self._set_qubit_to_one()

            elif pow(self.alpha.module(), 2) > pow(self.beta.module(), 2):
                self._set_qubit_to_zero()

            else:
                if randint(0, 1) == 1:
                    self._set_qubit_to_one()
                else:
                    self._set_qubit_to_zero()

            self.is_observed = True
        print("\n ...OBSERVING THE QUBIT... \n")
        print("The value of the Qubit is: {0}".format(self.value))

    def analyze_wave_function(self):
        print("WaveFunction: ")
        print("|S> = ({0})|0> + ({1})|1>".format(self.alpha.get_complex_value(), self.beta.get_complex_value()))
        print("Probabilities: ")
        print("|S> = ({0}%)|0> + ({1}%)|1>".format(pow(self.alpha.module(), 2) * 100, pow(self.beta.module(), 2) * 100))

    def probabilistic_density(self):
        print("Density: {0}".format(pow(self.alpha.module(), 2) + pow(self.beta.module(), 2)))

    def _set_qubit_to_one(self):
        self.value = 1
        self.alpha.set_values(0, 0)
        self.beta.set_values(1, 0)

    def _set_qubit_to_zero(self):
        self.value = 0
        self.alpha.set_values(1, 0)
        self.beta.set_values(0, 0)

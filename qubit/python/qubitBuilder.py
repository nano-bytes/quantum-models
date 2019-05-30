from utils import Utilities
from complex import Complex
from qubit import Qubit


class QubitBuilder:
    """
    This class builds several types of qubits 
    """

    @staticmethod
    def build_random_qubit():
        """
        This method creates a qubit with random probability
        :return: qubit with random probability
        """
        normalize_vector = Utilities.random_distribution_generation(4)
        alpha_function = Complex(pow(normalize_vector[0], 0.5), pow(normalize_vector[1], 0.5))
        beta_function = Complex(pow(normalize_vector[2], 0.5), pow(normalize_vector[3], 0.5))
        return Qubit(alpha_function, beta_function)

    @staticmethod
    def build_equal_opportunity_qubit():
        """
        This method creates a qubit with equal-opportunity
        :return: equal-opportunity qubit 
        """
        equal_opportunity_number = 1/pow(2,0.5)
        alpha_function = Complex(equal_opportunity_number, 0)
        beta_function = Complex(equal_opportunity_number, 0)
        return Qubit(alpha_function, beta_function)
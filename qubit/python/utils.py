import random


class Utilities:
    """
    Utilities used for the calculations
    """

    @staticmethod
    def random_distribution_generation(n):
        """
        This method generates a random distribution vector according to the number of elements
        :param n: the number of elements
        :return: the normalized vector of the distribution
        """
        sum = 0
        random_numbers=[]

        for x in range (0, n):
            random_number = random.random()
            random_numbers.append(random_number)
            sum = sum + random_number
        return Utilities.normalize_vector(random_numbers, sum)

    @staticmethod
    def normalize_vector(random_numbers, sum):
        """
        This method converts one vector into another in which all its elements add up to 1  
        :param random_numbers: the vector of random numbers
        :param sum: the total sum of all random numbers contained into vector
        :return: the normalized vector
        """
        normalize_vector = []
        for x in range (0, len(random_numbers)):
            normalize_vector.append(random_numbers[x]/sum)
        return normalize_vector
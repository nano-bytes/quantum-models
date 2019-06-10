from qubitBuilder import QubitBuilder


def analyze_qubit(qubit):
    qubit.probabilistic_density()
    qubit.analyze_wave_function()
    qubit.observe()

print("============= RANDOM QUBIT =============")
qubit_one = QubitBuilder.build_random_qubit()
analyze_qubit(qubit_one)
analyze_qubit(qubit_one)

print("\n============= EQUAL-OPPORTUNITY QUBIT =============")
qubit_two = QubitBuilder.build_equal_opportunity_qubit()
analyze_qubit(qubit_two)
analyze_qubit(qubit_two)

# Average Function Documentation

## a) Functional Description 
The `average` function is used to calculates the average which is of the first `k` elements to be used of an integer array, `list`. 
- So it means If `k` is actually greater than the size of the array, that means the function will have to use all the elements of the array for this calculation. 
- If this array used is empty or `k` is zero, then the function will returns `0`.

---

## b) Functional Test Case 
**Test Cases:**

| Input                         | Expected Output |
|-------------------------------|-----------------|
| `k = 3; list = {4, 8, 12, 16}` | `8` (Average of first 3 elements) |
| `k = 5; list = {2, 4, 6, 8}`   | `5` (All elements used)        |
| `k = 0; list = {1, 2, 3}`      | `0` (No elements for averaging)          |
| `k = 2; list = {}`             | `0` (Empty array)             |

---

## c) Partitions and Partition Test Cases
### Partitions:
1. **Array size (`list.length`) greater than `k`**
2. **Array size equal to `k`**
3. **Array size less than `k`**
4. **Empty array **
5. **Edge cases**

### Partition Test Cases:
| Input              | Input List             | Partition Description              |
|--------------------|------------------------|-------------------------------------|
| `k = 3`            | `list = {10, 20, 30, 40}` | Array.size > `k`                   |
| `k = 4`            | `list = {10, 20, 30, 40}` | Array.size = `k`                   |
| `k = 5`            | `list = {10, 20, 30, 40}` | Array.size < `k`                   |
| `k = 0`            | `list = {10, 20, 30}`    | `k = 0`                            |
| `k = 1`            | `list = {10}`            | `k = 1`                            |


---

## d) Boundary Value Test Cases 
| Input                         | Description                                              |
|-------------------------------|----------------------------------------------------------|
| `k = 1; list = {100}`         | Smallest non-zero `k` with one element                   |
| `k = 0; list = {}`            | Boundary case with empty array                           |
| `k = 0; list = {10, 20}`      | Boundary case with non-empty array and `k = 0`           |
| `k = 1000; list = {1, 2, 3}`  | Boundary case where `k` far exceeds array length         |

---

## f) Injecting a Fault and Fixing Failures 
### Fault Injection Example:
- **Change:** To fix it you will have to modify `Math.min(k, list.length)` to now new change `Math.max(k, list.length)`.
- **Expected Behavior:** So in some cases some tests will have to fail because using `Math.max` could actually lead to unintended behavior when `k` exceeds the length of the array.

### So to Fix:
- **You would have to actually revert the change made:** Use `Math.min(k, list.length)` instead.
- **To do Validation:** You must re-run the test cases until all pass successfully.

---

## g) Code Coverage Using EclEmma 
### Steps:
1. **Install EclEmma**:
   - Install the EclEmma plugin in the Eclipse IDE.
2. **Run Coverage**:
   - Execute the `AverageTest` class using "Coverage As -> JUnit Test".
3. **Ensure Coverage**:
   - Verify that all branches and paths in the `average` function are covered.

### Deliverables:
- **Functional Description**
- **JUnit Test Cases**
- **Partition and Boundary Test Cases**
- **Code Coverage Report**
- **Fault Injection Analysis**

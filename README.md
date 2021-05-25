# Leetcode

Back track problem:
Permutation, combination of sum, N Queen.

How to sort List<>:
Collections.sort(intervals, Comparator.comparing((int x)->x[0]));

Arrays.sort(logs, (a, b) -> a[0] - b[0]);

maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1+o2);
            }
        });

int[] arr = new int[5]; 
List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());


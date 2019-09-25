package practice.DP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author AjayDeepakSrinivasan on 16-09-2019, 14:55
 * @project Algos&Ds
 *
 * Page Faults in LRU
 *
 * Problem:
 *   In operating systems that use paging for memory management, page replacement algorithm are needed to decide which page needs
 *   to be replaced when the new page comes in. Whenever a new page is referred and is not present in memory, the page fault occurs
 *   and Operating System replaces one of the existing pages with a newly needed page. Given a sequence of pages and memory capacity,
 *   your task is to find the number of page faults using Least Recently Used (LRU) Algorithm.
 */

public class LRUPageFaults {

    public static void main(String args[])
    {
        int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};

        int capacity = 4;

        System.out.println(pageFaults(pages, pages.length, capacity));
    }

    // Method to find page faults using indexes
    static int pageFaults(int pages[], int n, int capacity)
    {
        // To represent set of current pages. We use
        // an unordered_set so that we quickly check
        // if a page is present in set or not
        HashSet<Integer> lruSet = new HashSet<>(capacity);

        // To store least recently used indexes
        // of pages.
        HashMap<Integer, Integer> lruPageIndexes = new HashMap<>();

        // Start from initial page
        int page_faults = 0;
        for (int i=0; i<n; i++)
        {
            // Check if the set can hold more pages
            if (lruSet.size() < capacity)
            {
                // Insert it into set if not present
                // already which represents page fault
                if (!lruSet.contains(pages[i]))
                {
                    lruSet.add(pages[i]);

                    // increment page fault
                    page_faults++;
                }

                // Store the recently used index of
                // each page
                lruPageIndexes.put(pages[i], i);
            }

            // If the set is full then need to perform lru
            // i.e. remove the least recently used page
            // and insert the current page
            else
            {
                // Check if current page is not already
                // present in the set
                if (!lruSet.contains(pages[i]))
                {
                    // Find the least recently used pages
                    // that is present in the set
                    int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;


                    Iterator<Integer> itr = lruSet.iterator();

                    while (itr.hasNext()) {
                        int temp = itr.next();
                        if (lruPageIndexes.get(temp) < lru)
                        {
                            lru = lruPageIndexes.get(temp);
                            val = temp;
                        }
                    }

                    // Remove the indexes page
                    lruSet.remove(val);
                    //remove lru from hashmap
                    lruPageIndexes.remove(val);
                    // insert the current page
                    lruSet.add(pages[i]);

                    // Increment page faults
                    page_faults++;
                }

                // Update the current page index
                lruPageIndexes.put(pages[i], i);
            }
        }

        return page_faults;
    }
}

package com.github.javadojo.binarysearch.advanced;

/**
 * A class to perform a binary search on a sorted array.
 *
 * @param <T> the datatype to use.
 */
public class BinaryGenericSearch<T extends Comparable<T>>
implements GenericSearch<T> {

    /**
     * Searches the value {@code toSearch} in the given (sorted) array of
     * {@code values}.
     *
     * @param values the sorted array to search through.
     * @param toSearch the value to search.
     * @return {@code true} if the value {@code toSearch} is found in the array
     *  {@code values}.
     */
    @Override
    public boolean search(T[] values, T toSearch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

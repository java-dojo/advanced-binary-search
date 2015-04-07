package com.github.javadojo.binarysearch.advanced;

/**
 * A generic interface to do a search on an array.
 *
 * @param <T> the datatype to use.
 */
public interface GenericSearch<T extends Comparable<T>> {

    /**
     * Searches the value {@code toSearch} in the given array {@code values}.
     *
     * @param values the array to search through.
     * @param toSearch the value to search.
     * @return {@code true} if the value {@code toSearch} is found in the array
     *  {@code values}.
     */
    boolean search(T[] values, T toSearch);

}

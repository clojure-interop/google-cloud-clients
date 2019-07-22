(ns com.google.cloud.spanner.Options
  "Specifies options for various spanner operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Options]))

(defn *limit
  "Specifying this will cause the read to yield at most this many rows. This should be greater
   than 0.

  limit - `long`

  returns: `com.google.cloud.spanner.Options$ReadOption`"
  (^com.google.cloud.spanner.Options$ReadOption [^Long limit]
    (Options/limit limit)))

(defn *prefetch-chunks
  "Specifying this will allow the client to prefetch up to prefetchChunks PartialResultSet chunks for read and query. The data size of each chunk depends on the server
   implementation but a good rule of thumb is that each chunk will be up to 1 MiB. Larger values
   reduce the likelihood of blocking while consuming results at the cost of greater memory
   consumption. prefetchChunks should be greater than 0. To get good performance choose a
   value that is large enough to allow buffering of chunks for an entire row. Apart from the
   buffered chunks, there can be at most one more row buffered in the client.

  prefetch-chunks - `int`

  returns: `com.google.cloud.spanner.Options$ReadAndQueryOption`"
  (^com.google.cloud.spanner.Options$ReadAndQueryOption [^Integer prefetch-chunks]
    (Options/prefetchChunks prefetch-chunks)))

(defn *page-size
  "Specifying this will cause the list operations to fetch at most this many records in a page.

  page-size - `int`

  returns: `com.google.cloud.spanner.Options$ListOption`"
  (^com.google.cloud.spanner.Options$ListOption [^Integer page-size]
    (Options/pageSize page-size)))

(defn *page-token
  "Specifying this will cause the list operation to start fetching the record from this onwards.

  page-token - `java.lang.String`

  returns: `com.google.cloud.spanner.Options$ListOption`"
  (^com.google.cloud.spanner.Options$ListOption [^java.lang.String page-token]
    (Options/pageToken page-token)))

(defn *filter
  "Specifying this will cause the given filter to be applied to the list operation. List
   operations that support this options are:


     InstanceAdminClient.listInstances(com.google.cloud.spanner.Options.ListOption...)


   If this option is passed to any other list operation, it will throw an
   IllegalArgumentException.

  filter - An expression for filtering the results of the request. Filter rules are case insensitive. Some examples of using filters are: name:* The entity has a name. name:Howl The entity's name contains \"howl\". name:HOWL Equivalent to above. NAME:howl Equivalent to above. labels.env:* The entity has the label env. labels.env:dev The entity has a label env whose value contains \"dev\". name:howl labels.env:dev The entity's name contains \"howl\" and it has the label env whose value contains \"dev\". - `java.lang.String`

  returns: `com.google.cloud.spanner.Options$ListOption`"
  (^com.google.cloud.spanner.Options$ListOption [^java.lang.String filter]
    (Options/filter filter)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Options this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Options this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Options this]
    (-> this (.hashCode))))


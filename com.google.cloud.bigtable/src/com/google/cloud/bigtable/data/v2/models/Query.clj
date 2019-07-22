(ns com.google.cloud.bigtable.data.v2.models.Query
  "A simple wrapper to construct a query for the ReadRows RPC."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Query]))

(defn *create
  "Constructs a new Query object for the specified table id. The table id will be combined with
   the instance name specified in the BigtableDataSettings.

  table-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^java.lang.String table-id]
    (Query/create table-id)))

(defn *from-proto
  "Wraps the protobuf ReadRowsRequest.

   WARNING: Please note that the project id & instance id in the table name will be overwritten
   by the configuration in the BigtableDataClient.

  request - `com.google.bigtable.v2.ReadRowsRequest`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^com.google.bigtable.v2.ReadRowsRequest request]
    (Query/fromProto request)))

(defn range
  "Adds a range to be looked up.

  start - The beginning of the range (inclusive). Can be null to represent negative infinity. - `java.lang.String`
  end - The end of the range (exclusive). Can be null to represent positive infinity. - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^java.lang.String start ^java.lang.String end]
    (-> this (.range start end)))
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange range]
    (-> this (.range range))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.ReadRowsRequest`"
  (^com.google.bigtable.v2.ReadRowsRequest [^Query this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toProto request-context))))

(defn shard
  "Split this query into multiple queries that can be evenly distributed across Bigtable nodes and
   be run in parallel. This method takes the results from BigtableDataClient.sampleRowKeysAsync(String) to divide this
   query into a set of disjoint queries that logically combine into form this query.

   Expected Usage:



   List<KeyOffset> keyOffsets = dataClient.sampleRowKeysAsync(\"my-table\").get();
   List<Query> queryShards = myQuery.shard(keyOffsets);
   List<ApiFuture<List<Row>>> futures = new ArrayList();
   for (Query subQuery : queryShards) {
     futures.add(dataClient.readRowsCallable().all().futureCall(subQuery));
   }
   List<List<Row>> results = ApiFutures.allAsList(futures).get();

  sampled-row-keys - `java.util.List`

  returns: `java.util.List<com.google.cloud.bigtable.data.v2.models.Query>`"
  (^java.util.List [^Query this ^java.util.List sampled-row-keys]
    (-> this (.shard sampled-row-keys))))

(defn prefix
  "prefix - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^com.google.protobuf.ByteString prefix]
    (-> this (.prefix prefix))))

(defn row-key
  "Adds a key to looked up

  key - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^java.lang.String key]
    (-> this (.rowKey key))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Query this]
    (-> this (.toString))))

(defn limit
  "Limits the number of rows that can be returned

  limit - `long`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^Long limit]
    (-> this (.limit limit))))

(defn get-bound
  "Get the minimal range that encloses all of the row keys and ranges in this Query.

  returns: `com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange`"
  (^com.google.cloud.bigtable.data.v2.models.Range$ByteStringRange [^Query this]
    (-> this (.getBound))))

(defn filter
  "Sets the filter to apply to each row. Only one filter can be set at a time. To use multiple
   filters, please use Filters.interleave() or Filters.chain().

  filter - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Query`"
  (^com.google.cloud.bigtable.data.v2.models.Query [^Query this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter filter]
    (-> this (.filter filter))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Query this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Query this ^java.lang.Object o]
    (-> this (.equals o))))


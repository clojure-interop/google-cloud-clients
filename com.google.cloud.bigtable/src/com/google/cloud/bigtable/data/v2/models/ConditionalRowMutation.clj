(ns com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation
  "Mutates a row atomically based on the output of a condition filter."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models ConditionalRowMutation]))

(defn *create
  "Creates a new instance of the mutation builder.

  table-id - `java.lang.String`
  row-key - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation [^java.lang.String table-id ^java.lang.String row-key]
    (ConditionalRowMutation/create table-id row-key)))

(defn condition
  "The filter to be applied to the contents of the specified row. Depending on whether or not any
   results are yielded, either the mutations added via then(Mutation) or otherwise(Mutation) will be executed. If unset, checks that the row contains any values at
   all.

   Unlike then(Mutation) and otherwise(Mutation), only a single condition can
   be set. However that filter can be a Filters.chain() or Filters.interleave(),
   which can wrap multiple other filters.

   WARNING: Filters.condition(Filter) is not supported.

  condition - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation [^ConditionalRowMutation this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter condition]
    (-> this (.condition condition))))

(defn then
  "Adds changes to be atomically applied to the specified row if the condition yields at least one
   cell when applied to the row.

   Each mutation can specify multiple changes and the changes are accumulated each time
   this method is called. Mutations are applied in order, meaning that earlier mutations can be
   masked by later ones. Must contain at least one entry if otherwise(Mutation) is empty,
   and at most 100000.

  mutation - `com.google.cloud.bigtable.data.v2.models.Mutation`

  returns: `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation [^ConditionalRowMutation this ^com.google.cloud.bigtable.data.v2.models.Mutation mutation]
    (-> this (.then mutation))))

(defn otherwise
  "Adds changes to be atomically applied to the specified row if the condition does not yields any
   cells when applied to the row.

   Each mutation can specify multiple changes and the changes are accumulated each time
   this method is called. Mutations are applied in order, meaning that earlier mutations can be
   masked by later ones. Must contain at least one entry if then(Mutation) is empty, and
   at most 100000.

  mutation - `com.google.cloud.bigtable.data.v2.models.Mutation`

  returns: `com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation`"
  (^com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation [^ConditionalRowMutation this ^com.google.cloud.bigtable.data.v2.models.Mutation mutation]
    (-> this (.otherwise mutation))))

(defn to-proto
  "Creates the underlying CheckAndMutateRowRequest protobuf.

   This method is considered an internal implementation detail and not meant to be used by
   applications.

  request-context - `com.google.cloud.bigtable.data.v2.internal.RequestContext`

  returns: `com.google.bigtable.v2.CheckAndMutateRowRequest`"
  (^com.google.bigtable.v2.CheckAndMutateRowRequest [^ConditionalRowMutation this ^com.google.cloud.bigtable.data.v2.internal.RequestContext request-context]
    (-> this (.toProto request-context))))


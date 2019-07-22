(ns com.google.cloud.bigtable.data.v2.models.Filters
  "A Fluent DSL to create a hierarchy of filters for the CheckAndMutateRow RPCs and ReadRows Query.

  Intended usage is to statically import, or in case of conflict, assign the static variable
  FILTERS and use its fluent API to build filters.

  Sample code:



  import static com.google.cloud.bigtable.data.v2.models.Filters.FILTERS;

  void main() {
    // Build the filter expression
    RowFilter filter = FILTERS.chain()
      .filter(FILTERS.qualifier().regex(\"prefix.*\"))
      .filter(FILTERS.limit().cellsPerRow(10));

    // Use it in a Query
    Query query = Query.create(\"[TABLE]\")
      .filter(filter);
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters]))

(def *-filters
  "Static Constant.

  Entry point into the DSL.

  type: com.google.cloud.bigtable.data.v2.models.Filters"
  Filters/FILTERS)

(defn offset
  "Returns the builder for offset related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$OffsetFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$OffsetFilter [^Filters this]
    (-> this (.offset))))

(defn pass
  "Matches all cells, regardless of input. Functionally equivalent to having no filter.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters this]
    (-> this (.pass))))

(defn label
  "Applies the given label to all cells in the output row. This allows the caller to determine
   which results were produced from which part of the filter.

   Due to a technical limitation, it is not currently possible to apply multiple labels to a
   cell. As a result, a Filters.ChainFilter may have no more than one sub-filter which contains a
   label. It is okay for an Filters.InterleaveFilter to contain multiple labels, as they will be
   applied to separate copies of the input. This may be relaxed in the future.

  label - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters this ^java.lang.String label]
    (-> this (.label label))))

(defn key
  "Returns the builder for row key related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$KeyFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$KeyFilter [^Filters this]
    (-> this (.key))))

(defn timestamp
  "Returns the builder for timestamp related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$TimestampFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$TimestampFilter [^Filters this]
    (-> this (.timestamp))))

(defn condition
  "Creates an empty condition filter. The filter results of the predicate can be configured by
   invoking Filters.ConditionFilter.then(Filters.Filter) and Filters.ConditionFilter.otherwise(Filters.Filter).

   A RowFilter which evaluates one of two possible RowFilters, depending on whether or not a
   predicate RowFilter outputs any cells from the input row.

   IMPORTANT NOTE: The predicate filter does not execute atomically with the Filters.ConditionFilter.then(Filters.Filter) and Filters.ConditionFilter.otherwise(Filters.Filter)
   (Filter)} filters, which may lead to inconsistent or unexpected results. Additionally, Filters.ConditionFilter may have poor performance, especially when filters are set for the Filters.ConditionFilter.otherwise(Filters.Filter).

  predicate - `com.google.cloud.bigtable.data.v2.models.Filters$Filter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ConditionFilter [^Filters this ^com.google.cloud.bigtable.data.v2.models.Filters$Filter predicate]
    (-> this (.condition predicate))))

(defn block
  "Does not match any cells, regardless of input. Useful for temporarily disabling just part of a
   filter.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters this]
    (-> this (.block))))

(defn from-proto
  "Wraps protobuf representation of a filter.

   For advanced use only.

  row-filter - `com.google.bigtable.v2.RowFilter`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters this ^com.google.bigtable.v2.RowFilter row-filter]
    (-> this (.fromProto row-filter))))

(defn limit
  "Returns the builder for limit related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$LimitFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$LimitFilter [^Filters this]
    (-> this (.limit))))

(defn value
  "Returns the builder for value related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ValueFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ValueFilter [^Filters this]
    (-> this (.value))))

(defn interleave
  "Creates an empty interleave filter list. Filters can be added to the interleave by invoking
   Filters.InterleaveFilter.filter(Filters.Filter).

   The elements of \"filters\" all process a copy of the input row, and the results are pooled,
   sorted, and combined into a single output row. If multiple cells are produced with the same
   column and timestamp, they will all appear in the output row in an unspecified mutual order.
   The full chain is executed atomically.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$InterleaveFilter [^Filters this]
    (-> this (.interleave))))

(defn sink
  "Outputs all cells directly to the output of the read rather than to any parent filter. For
   advanced usage, see comments in
   https://github.com/googleapis/googleapis/blob/master/google/bigtable/v2/data.proto for more
   details.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters this]
    (-> this (.sink))))

(defn qualifier
  "Returns the builder for column qualifier related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$QualifierFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$QualifierFilter [^Filters this]
    (-> this (.qualifier))))

(defn family
  "Returns the builder for column family related filters.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$FamilyFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$FamilyFilter [^Filters this]
    (-> this (.family))))

(defn chain
  "Creates an empty chain filter list. Filters can be added to the chain by invoking Filters.ChainFilter.filter(Filters.Filter).

   The elements of \"filters\" are chained together to process the input row:



   in row -> filter0 -> intermediate row -> filter1 -> ... -> filterN -> out row

   The full chain is executed atomically.

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$ChainFilter [^Filters this]
    (-> this (.chain))))


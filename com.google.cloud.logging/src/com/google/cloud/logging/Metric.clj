(ns com.google.cloud.logging.Metric
  "Stackdriver Logging metrics describe logs-based metric. The value of the metric is the number of
  log entries that match a logs filter (see MetricInfo.getFilter()).

  Metric adds a layer of service-related functionality over MetricInfo. Objects
  of this class are immutable. To get a Metric object with the most recent information use
  reload() or reloadAsync()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Metric]))

(defn delete
  "Deletes this metric.

   Example of deleting the metric.



   boolean deleted = metric.delete();
   if (deleted) {
     // the metric was deleted
   } else {
     // the metric was not found
   }

  returns: true if the metric was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^Boolean [^Metric this]
    (-> this (.delete))))

(defn update
  "Updates current metric. If the metric does not exist, it is created.

   Example of updating the metric's information.



   Metric updatedMetric = metric.toBuilder()
       .setDescription(\"A more detailed description\")
       .build()
       .update();

  returns: a Metric object with updated information - `com.google.cloud.logging.Metric`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Metric [^Metric this]
    (-> this (.update))))

(defn reload-async
  "Sends a request to fetch current metric's latest information. This method returns a ApiFuture object to consume the result. Future.get() returns a Metric
   object with latest information or null if not found.

   Example of asynchronously getting the metric's latest information.



   ApiFuture<Metric> future = metric.reloadAsync();
   // ...
   Metric latestMetric = future.get();
   if (latestMetric == null) {
     // the metric was not found
   }

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Metric>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Metric this]
    (-> this (.reloadAsync))))

(defn delete-async
  "Sends a request for deleting this metric. This method returns a ApiFuture object to
   consume the result. Future.get() returns true if the metric was deleted,
   false if it was not found.

   Example of asynchronously deleting the metric.



   ApiFuture<Boolean> future = metric.deleteAsync();
   // ...
   boolean deleted = future.get();
   if (deleted) {
     // the metric was deleted
   } else {
     // the metric was not found
   }

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Metric this]
    (-> this (.deleteAsync))))

(defn get-logging
  "Returns the metrics's Logging object used to issue requests.

  returns: `com.google.cloud.logging.Logging`"
  (^com.google.cloud.logging.Logging [^Metric this]
    (-> this (.getLogging))))

(defn reload
  "Fetches current metric's latest information. Returns null if the metric does not exist.

   Example of getting the metric's latest information.



   Metric latestMetric = metric.reload();
   if (latestMetric == null) {
     // the metric was not found
   }

  returns: a Metric object with latest information or null if not found - `com.google.cloud.logging.Metric`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Metric [^Metric this]
    (-> this (.reload))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Metric this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Metric this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn update-async
  "Sends a request to update current metric. If the metric does not exist, it is created. This
   method returns a ApiFuture object to consume the result. Future.get()
   returns a Metric object with updated information.

   Example of asynchronously updating the metric's information.



   ApiFuture<Metric> future = metric.toBuilder()
       .setDescription(\"A more detailed description\")
       .build()
       .updateAsync();
   // ...
   Metric updatedMetric = future.get();

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Metric>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Metric this]
    (-> this (.updateAsync))))

(defn to-builder
  "Description copied from class: MetricInfo

  returns: `com.google.cloud.logging.Metric$Builder`"
  (^com.google.cloud.logging.Metric$Builder [^Metric this]
    (-> this (.toBuilder))))


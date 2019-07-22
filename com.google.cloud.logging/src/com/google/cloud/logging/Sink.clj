(ns com.google.cloud.logging.Sink
  "Stackdriver Logging sinks can be used to control the export of your logs. Each sink specifies the
  export of a set of log entries to a certain destination. A sink consists of a name, unique to the
  project, a filter for choosing the log entries to export and a destination for the log entries.

  Sink destination can either be a Google Cloud Storage bucket (see SinkInfo.Destination.BucketDestination, a Google Cloud BigQuery dataset (see SinkInfo.Destination.DatasetDestination) or a Google CloudPub/Sub topic (see SinkInfo.Destination.TopicDestination).

  Sink adds a layer of service-related functionality over SinkInfo. Objects of
  this class are immutable. To get a Sink object with the most recent information use
  reload() or reloadAsync()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Sink]))

(defn delete
  "Deletes this sink.

   Example of deleting the sink.



   boolean deleted = sink.delete();
   if (deleted) {
     // the sink was deleted
   } else {
     // the sink was not found
   }

  returns: true if the sink was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^Boolean [^Sink this]
    (-> this (.delete))))

(defn update
  "Updates current sink. If the sink does not exist, it is created.

   Example of updating the sink's information.



   Sink updatedSink = sink.toBuilder()
       .setFilter(\"severity<=ERROR\")
       .build()
       .update();

  returns: a Sink object with updated information - `com.google.cloud.logging.Sink`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Sink [^Sink this]
    (-> this (.update))))

(defn reload-async
  "Sends a request to fetch current sink's latest information. This method returns a ApiFuture object to consume the result. Future.get() returns a Sink object
   with latest information or null if not found.

   Example of asynchronously getting the sink's latest information.



   ApiFuture<Sink> future = sink.reloadAsync();
   // ...
   Sink latestSink = future.get();
   if (latestSink == null) {
     // the sink was not found
   }

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Sink>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Sink this]
    (-> this (.reloadAsync))))

(defn delete-async
  "Sends a request for deleting this sink. This method returns a ApiFuture object to
   consume the result. Future.get() returns true if the sink was deleted,
   false if it was not found.

   Example of asynchronously deleting the sink.



   ApiFuture<Boolean> future = sink.deleteAsync();
   // ...
   boolean deleted = future.get();
   if (deleted) {
     // the sink was deleted
   } else {
     // the sink was not found
   }

  returns: `com.google.api.core.ApiFuture<java.lang.Boolean>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Sink this]
    (-> this (.deleteAsync))))

(defn get-logging
  "Returns the sinks's Logging object used to issue requests.

  returns: `com.google.cloud.logging.Logging`"
  (^com.google.cloud.logging.Logging [^Sink this]
    (-> this (.getLogging))))

(defn reload
  "Fetches current sink's latest information. Returns null if the sink does not exist.

   Example of getting the sink's latest information.



   Sink latestSink = sink.reload();
   if (latestSink == null) {
     // the sink was not found
   }

  returns: a Sink object with latest information or null if not found - `com.google.cloud.logging.Sink`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.cloud.logging.Sink [^Sink this]
    (-> this (.reload))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Sink this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Sink this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn update-async
  "Sends a request to update current sink. If the sink does not exist, it is created. This method
   returns a ApiFuture object to consume the result. Future.get() returns a
   Sink object with updated information.

   Example of asynchronously updating the sink's information.



   ApiFuture<Sink> future = sink.toBuilder()
       .setFilter(\"severity<=ERROR\")
       .build()
       .updateAsync();
   // ...
   Sink updatedSink = future.get();

  returns: `com.google.api.core.ApiFuture<com.google.cloud.logging.Sink>`

  throws: com.google.cloud.logging.LoggingException - upon failure"
  (^com.google.api.core.ApiFuture [^Sink this]
    (-> this (.updateAsync))))

(defn to-builder
  "Description copied from class: SinkInfo

  returns: `com.google.cloud.logging.Sink$Builder`"
  (^com.google.cloud.logging.Sink$Builder [^Sink this]
    (-> this (.toBuilder))))


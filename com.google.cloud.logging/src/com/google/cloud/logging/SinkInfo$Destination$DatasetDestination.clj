(ns com.google.cloud.logging.SinkInfo$Destination$DatasetDestination
  "Class for specifying a Google Cloud BigQuery dataset as destination for the sink."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Destination$DatasetDestination]))

(defn *of
  "Creates a DatasetDestination object given the name of the project and dataset to be
   used as sink destination.

  project - `java.lang.String`
  dataset - `java.lang.String`

  returns: `com.google.cloud.logging.SinkInfo$Destination$DatasetDestination`"
  (^com.google.cloud.logging.SinkInfo$Destination$DatasetDestination [^java.lang.String project ^java.lang.String dataset]
    (SinkInfo$Destination$DatasetDestination/of project dataset))
  (^com.google.cloud.logging.SinkInfo$Destination$DatasetDestination [^java.lang.String dataset]
    (SinkInfo$Destination$DatasetDestination/of dataset)))

(defn get-project
  "Returns the name of the project where the Google Cloud BigQuery dataset resides. If null, the default project is used.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$DatasetDestination this]
    (-> this (.getProject))))

(defn get-dataset
  "Returns the name of the Google Cloud BigQuery dataset this destination represents.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$DatasetDestination this]
    (-> this (.getDataset))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SinkInfo$Destination$DatasetDestination this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SinkInfo$Destination$DatasetDestination this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$DatasetDestination this]
    (-> this (.toString))))


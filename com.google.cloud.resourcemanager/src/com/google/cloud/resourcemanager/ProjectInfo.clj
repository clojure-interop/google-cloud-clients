(ns com.google.cloud.resourcemanager.ProjectInfo
  "A Google Cloud Resource Manager project metadata object. A Project is a high-level Google Cloud
  Platform entity. It is a container for ACLs, APIs, AppEngine Apps, VMs, and other Google Cloud
  Platform resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ProjectInfo]))

(def *-date-time-formatter
  "Static Constant.

  type: org.threeten.bp.format.DateTimeFormatter"
  ProjectInfo/DATE_TIME_FORMATTER)

(defn *new-builder
  "id - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^java.lang.String id]
    (ProjectInfo/newBuilder id)))

(defn get-project-id
  "Get the unique, user-assigned ID of the project.

   This field cannot be changed after the server creates the project.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo this]
    (-> this (.getProjectId))))

(defn get-project-number
  "Get number uniquely identifying the project.

   This field is set by the server and is read-only.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ProjectInfo this]
    (-> this (.getProjectNumber))))

(defn get-name
  "Get the user-assigned name of the project.

   This field is optional, can remain unset, and can be changed after project creation.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo this]
    (-> this (.getName))))

(defn get-state
  "Get the project's lifecycle state.

   This is a read-only field. To change the lifecycle state of your project, use the delete or undelete method.

  returns: `com.google.cloud.resourcemanager.ProjectInfo$State`"
  (^com.google.cloud.resourcemanager.ProjectInfo$State [^ProjectInfo this]
    (-> this (.getState))))

(defn get-labels
  "Get the immutable map of labels associated with this project.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectInfo this]
    (-> this (.getLabels))))

(defn get-create-time-millis
  "Get the project's creation time (in milliseconds).

   This field is set by the server and is read-only.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ProjectInfo this]
    (-> this (.getCreateTimeMillis))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectInfo this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "returns: `com.google.cloud.resourcemanager.ProjectInfo$Builder`"
  (^com.google.cloud.resourcemanager.ProjectInfo$Builder [^ProjectInfo this]
    (-> this (.toBuilder))))


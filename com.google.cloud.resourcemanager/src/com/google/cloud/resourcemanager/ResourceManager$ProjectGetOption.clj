(ns com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption
  "Class for specifying project get options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManager$ProjectGetOption]))

(defn *fields
  "Returns an option to specify the project's fields to be returned by the RPC call.

   If this option is not provided all project fields are returned. ProjectGetOption.fields can be used to specify only the fields of interest. Project ID is
   always returned, even if not specified. ResourceManager.ProjectField provides a list of fields that
   can be used.

  fields - `com.google.cloud.resourcemanager.ResourceManager$ProjectField`

  returns: `com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption`"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectGetOption [^com.google.cloud.resourcemanager.ResourceManager$ProjectField fields]
    (ResourceManager$ProjectGetOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceManager$ProjectGetOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceManager$ProjectGetOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceManager$ProjectGetOption this]
    (-> this (.toString))))


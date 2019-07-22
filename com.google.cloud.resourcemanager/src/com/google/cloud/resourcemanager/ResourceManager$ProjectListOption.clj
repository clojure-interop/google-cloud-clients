(ns com.google.cloud.resourcemanager.ResourceManager$ProjectListOption
  "Class for specifying project list options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManager$ProjectListOption]))

(defn *filter
  "Returns an option to specify a filter.

   Filter rules are case insensitive. The fields eligible for filtering are:


     name
     project ID
     labels.key, where key is the name of a label


   You can specify multiple filters by adding a space between each filter. Multiple filters
   are composed using \"and\".

   Some examples of filters:


     name:* The project has a name.
     name:Howl The project's name is Howl or howl.
     name:HOWL Equivalent to above.
     NAME:howl Equivalent to above.
     labels.color:* The project has the label color.
     labels.color:red The project's label color has the value red.
     labels.color:red label.size:big The project's label color has the value red and its
         label size has the value big.

  filter - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ResourceManager$ProjectListOption`"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectListOption [^java.lang.String filter]
    (ResourceManager$ProjectListOption/filter filter)))

(defn *page-token
  "Returns an option to specify a page token.

   The page token (returned from a previous call to list) indicates from where listing should
   continue.

  page-token - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ResourceManager$ProjectListOption`"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectListOption [^java.lang.String page-token]
    (ResourceManager$ProjectListOption/pageToken page-token)))

(defn *page-size
  "The maximum number of projects to return per RPC.

   The server can return fewer projects than requested. When there are more results than the
   page size, the server will return a page token that can be used to fetch other results.

  page-size - `int`

  returns: `com.google.cloud.resourcemanager.ResourceManager$ProjectListOption`"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectListOption [^Integer page-size]
    (ResourceManager$ProjectListOption/pageSize page-size)))

(defn *fields
  "Returns an option to specify the project's fields to be returned by the RPC call.

   If this option is not provided all project fields are returned. ProjectListOption.fields can be used to specify only the fields of interest. Project ID is
   always returned, even if not specified. ResourceManager.ProjectField provides a list of fields that
   can be used.

  fields - `com.google.cloud.resourcemanager.ResourceManager$ProjectField`

  returns: `com.google.cloud.resourcemanager.ResourceManager$ProjectListOption`"
  (^com.google.cloud.resourcemanager.ResourceManager$ProjectListOption [^com.google.cloud.resourcemanager.ResourceManager$ProjectField fields]
    (ResourceManager$ProjectListOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceManager$ProjectListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceManager$ProjectListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceManager$ProjectListOption this]
    (-> this (.toString))))


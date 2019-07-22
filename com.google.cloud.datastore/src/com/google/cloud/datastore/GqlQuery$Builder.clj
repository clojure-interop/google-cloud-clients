(ns com.google.cloud.datastore.GqlQuery$Builder
  "A GQL query builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore GqlQuery$Builder]))

(defn set-query
  "Sets the GQL query.

  query - `java.lang.String`

  returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this ^java.lang.String query]
    (-> this (.setQuery query))))

(defn set-namespace
  "Sets the namespace for the GQL query.

  namespace - `java.lang.String`

  returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))

(defn set-allow-literal
  "Sets whether the query string can contain literals. When false, the query string must
   not contain any literals and instead must bind all values.

  allow-literal - `boolean`

  returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this ^Boolean allow-literal]
    (-> this (.setAllowLiteral allow-literal))))

(defn clear-bindings
  "returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this]
    (-> this (.clearBindings))))

(defn set-binding
  "Sets a new named binding.

  name - name of the binding - `java.lang.String`
  cursor - a Cursor object that binds to a given name - `com.google.cloud.datastore.Cursor`

  returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this ^java.lang.String name ^com.google.cloud.datastore.Cursor cursor]
    (-> this (.setBinding name cursor))))

(defn add-binding
  "Sets a new positional binding.

  cursor - a Cursor object to be set as a new positional binding - `com.google.cloud.datastore.Cursor`

  returns: `com.google.cloud.datastore.GqlQuery$Builder<V>`"
  (^com.google.cloud.datastore.GqlQuery$Builder [^GqlQuery$Builder this ^com.google.cloud.datastore.Cursor cursor]
    (-> this (.addBinding cursor))))

(defn build
  "returns: `com.google.cloud.datastore.GqlQuery<V>`"
  (^com.google.cloud.datastore.GqlQuery [^GqlQuery$Builder this]
    (-> this (.build))))


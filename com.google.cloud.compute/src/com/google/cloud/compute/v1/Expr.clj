(ns com.google.cloud.compute.v1.Expr
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Expr]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Expr`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^com.google.cloud.compute.v1.Expr prototype]
    (Expr/newBuilder prototype))
  (^com.google.cloud.compute.v1.Expr$Builder []
    (Expr/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Expr`"
  (^com.google.cloud.compute.v1.Expr []
    (Expr/getDefaultInstance )))

(defn get-location
  "An optional string indicating the location of the expression for error reporting, e.g. a file
   name and a position in the file.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr this]
    (-> this (.getLocation))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Expr this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Expr this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Expr this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-description
  "An optional description of the expression. This is a longer text which describes the
   expression, e.g. when hovered over it in a UI.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr this]
    (-> this (.getDescription))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Expr this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Expr this]
    (-> this (.hashCode))))

(defn get-expression
  "Textual representation of an expression in Common Expression Language syntax.

   The application context of the containing message determines which well-known feature set of
   CEL is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr this]
    (-> this (.getExpression))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Expr this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-title
  "An optional title for the expression, i.e. a short string describing its purpose. This can be
   used e.g. in UIs which allow to enter the expression.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr this]
    (-> this (.getTitle))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr this]
    (-> this (.toBuilder))))


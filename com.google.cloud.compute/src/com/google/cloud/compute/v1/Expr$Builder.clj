(ns com.google.cloud.compute.v1.Expr$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Expr$Builder]))

(defn set-description
  "An optional description of the expression. This is a longer text which describes the
   expression, e.g. when hovered over it in a UI.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-location
  "An optional string indicating the location of the expression for error reporting, e.g. a file
   name and a position in the file.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr$Builder this]
    (-> this (.getLocation))))

(defn set-location
  "An optional string indicating the location of the expression for error reporting, e.g. a file
   name and a position in the file.

  location - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-expression
  "Textual representation of an expression in Common Expression Language syntax.

   The application context of the containing message determines which well-known feature set
   of CEL is supported.

  expression - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this ^java.lang.String expression]
    (-> this (.setExpression expression))))

(defn build
  "returns: `com.google.cloud.compute.v1.Expr`"
  (^com.google.cloud.compute.v1.Expr [^Expr$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of the expression. This is a longer text which describes the
   expression, e.g. when hovered over it in a UI.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr$Builder this]
    (-> this (.getDescription))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Expr`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this ^com.google.cloud.compute.v1.Expr other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this]
    (-> this (.clone))))

(defn get-expression
  "Textual representation of an expression in Common Expression Language syntax.

   The application context of the containing message determines which well-known feature set
   of CEL is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr$Builder this]
    (-> this (.getExpression))))

(defn get-title
  "An optional title for the expression, i.e. a short string describing its purpose. This can be
   used e.g. in UIs which allow to enter the expression.

  returns: `java.lang.String`"
  (^java.lang.String [^Expr$Builder this]
    (-> this (.getTitle))))

(defn set-title
  "An optional title for the expression, i.e. a short string describing its purpose. This can be
   used e.g. in UIs which allow to enter the expression.

  title - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Expr$Builder`"
  (^com.google.cloud.compute.v1.Expr$Builder [^Expr$Builder this ^java.lang.String title]
    (-> this (.setTitle title))))


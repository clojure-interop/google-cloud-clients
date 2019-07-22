(ns com.google.cloud.logging.v2.MetricsClient
  "Service Description: Service for configuring logs-based metrics.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (MetricsClient metricsClient = MetricsClient.create()) {
    MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
    LogMetric response = metricsClient.getLogMetric(metricName);
  }

  Note: close() needs to be called on the metricsClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of MetricsSettings to create().
  For example:

  To customize credentials:



  MetricsSettings metricsSettings =
      MetricsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  MetricsClient metricsClient =
      MetricsClient.create(metricsSettings);

  To customize the endpoint:



  MetricsSettings metricsSettings =
      MetricsSettings.newBuilder().setEndpoint(myEndpoint).build();
  MetricsClient metricsClient =
      MetricsClient.create(metricsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 MetricsClient]))

(defn *create
  "Constructs an instance of MetricsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.logging.v2.MetricsSettings`

  returns: `com.google.cloud.logging.v2.MetricsClient`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.MetricsClient [^com.google.cloud.logging.v2.MetricsSettings settings]
    (MetricsClient/create settings))
  (^com.google.cloud.logging.v2.MetricsClient []
    (MetricsClient/create )))

(defn update-log-metric
  "Creates or updates a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     LogMetric metric = LogMetric.newBuilder().build();
     LogMetric response = metricsClient.updateLogMetric(metricName, metric);
   }

  metric-name - The resource name of the metric to update: \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\" The updated metric must be provided in the request and it's `name` field must be the same as `[METRIC_ID]` If the metric does not exist in `[PROJECT_ID]`, then a new metric is created. - `com.google.logging.v2.MetricName`
  metric - The updated metric. - `com.google.logging.v2.LogMetric`

  returns: `com.google.logging.v2.LogMetric`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogMetric [^MetricsClient this ^com.google.logging.v2.MetricName metric-name ^com.google.logging.v2.LogMetric metric]
    (-> this (.updateLogMetric metric-name metric)))
  (^com.google.logging.v2.LogMetric [^MetricsClient this ^com.google.logging.v2.UpdateLogMetricRequest request]
    (-> this (.updateLogMetric request))))

(defn get-settings
  "returns: `com.google.cloud.logging.v2.MetricsSettings`"
  (^com.google.cloud.logging.v2.MetricsSettings [^MetricsClient this]
    (-> this (.getSettings))))

(defn get-log-metric-callable
  "Gets a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     GetLogMetricRequest request = GetLogMetricRequest.newBuilder()
       .setMetricName(metricName.toString())
       .build();
     ApiFuture<LogMetric> future = metricsClient.getLogMetricCallable().futureCall(request);
     // Do something
     LogMetric response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.getLogMetricCallable))))

(defn create-log-metric
  "Creates a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogMetric metric = LogMetric.newBuilder().build();
     LogMetric response = metricsClient.createLogMetric(parent, metric);
   }

  parent - The resource name of the project in which to create the metric: \"projects/[PROJECT_ID]\" The new metric must be provided in the request. - `com.google.logging.v2.ParentName`
  metric - The new logs-based metric, which must not have an identifier that already exists. - `com.google.logging.v2.LogMetric`

  returns: `com.google.logging.v2.LogMetric`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogMetric [^MetricsClient this ^com.google.logging.v2.ParentName parent ^com.google.logging.v2.LogMetric metric]
    (-> this (.createLogMetric parent metric)))
  (^com.google.logging.v2.LogMetric [^MetricsClient this ^com.google.logging.v2.CreateLogMetricRequest request]
    (-> this (.createLogMetric request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.MetricsServiceV2Stub`"
  ([^MetricsClient this]
    (-> this (.getStub))))

(defn create-log-metric-callable
  "Creates a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogMetric metric = LogMetric.newBuilder().build();
     CreateLogMetricRequest request = CreateLogMetricRequest.newBuilder()
       .setParent(parent.toString())
       .setMetric(metric)
       .build();
     ApiFuture<LogMetric> future = metricsClient.createLogMetricCallable().futureCall(request);
     // Do something
     LogMetric response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.createLogMetricCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^MetricsClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^MetricsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^MetricsClient this]
    (-> this (.shutdown))))

(defn list-log-metrics-callable
  "Lists logs-based metrics.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListLogMetricsRequest request = ListLogMetricsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListLogMetricsResponse response = metricsClient.listLogMetricsCallable().call(request);
       for (LogMetric element : response.getMetricsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.logging.v2.ListLogMetricsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.listLogMetricsCallable))))

(defn close
  ""
  ([^MetricsClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^MetricsClient this]
    (-> this (.isTerminated))))

(defn delete-log-metric
  "Deletes a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     metricsClient.deleteLogMetric(metricName);
   }

  metric-name - The resource name of the metric to delete: \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\" - `com.google.logging.v2.MetricName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^MetricsClient this ^com.google.logging.v2.MetricName metric-name]
    (-> this (.deleteLogMetric metric-name))))

(defn update-log-metric-callable
  "Creates or updates a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     LogMetric metric = LogMetric.newBuilder().build();
     UpdateLogMetricRequest request = UpdateLogMetricRequest.newBuilder()
       .setMetricName(metricName.toString())
       .setMetric(metric)
       .build();
     ApiFuture<LogMetric> future = metricsClient.updateLogMetricCallable().futureCall(request);
     // Do something
     LogMetric response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateLogMetricRequest,com.google.logging.v2.LogMetric>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.updateLogMetricCallable))))

(defn delete-log-metric-callable
  "Deletes a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     DeleteLogMetricRequest request = DeleteLogMetricRequest.newBuilder()
       .setMetricName(metricName.toString())
       .build();
     ApiFuture<Void> future = metricsClient.deleteLogMetricCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogMetricRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.deleteLogMetricCallable))))

(defn list-log-metrics
  "Lists logs-based metrics.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (LogMetric element : metricsClient.listLogMetrics(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The name of the project containing the metrics: \"projects/[PROJECT_ID]\" - `com.google.logging.v2.ParentName`

  returns: `com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse [^MetricsClient this ^com.google.logging.v2.ParentName parent]
    (-> this (.listLogMetrics parent))))

(defn shutdown-now
  ""
  ([^MetricsClient this]
    (-> this (.shutdownNow))))

(defn get-log-metric
  "Gets a logs-based metric.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     MetricName metricName = ProjectMetricName.of(\"[PROJECT]\", \"[METRIC]\");
     LogMetric response = metricsClient.getLogMetric(metricName);
   }

  metric-name - The resource name of the desired metric: \"projects/[PROJECT_ID]/metrics/[METRIC_ID]\" - `com.google.logging.v2.MetricName`

  returns: `com.google.logging.v2.LogMetric`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogMetric [^MetricsClient this ^com.google.logging.v2.MetricName metric-name]
    (-> this (.getLogMetric metric-name))))

(defn list-log-metrics-paged-callable
  "Lists logs-based metrics.

   Sample code:



   try (MetricsClient metricsClient = MetricsClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListLogMetricsRequest request = ListLogMetricsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListLogMetricsPagedResponse> future = metricsClient.listLogMetricsPagedCallable().futureCall(request);
     // Do something
     for (LogMetric element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogMetricsRequest,com.google.cloud.logging.v2.MetricsClient$ListLogMetricsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricsClient this]
    (-> this (.listLogMetricsPagedCallable))))


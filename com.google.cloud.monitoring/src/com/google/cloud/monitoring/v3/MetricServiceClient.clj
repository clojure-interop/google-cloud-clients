(ns com.google.cloud.monitoring.v3.MetricServiceClient
  "Service Description: Manages metric descriptors, monitored resource descriptors, and time series
  data.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
    MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of(\"[PROJECT]\", \"[MONITORED_RESOURCE_DESCRIPTOR]\");
    MonitoredResourceDescriptor response = metricServiceClient.getMonitoredResourceDescriptor(name);
  }

  Note: close() needs to be called on the metricServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of MetricServiceSettings to
  create(). For example:

  To customize credentials:



  MetricServiceSettings metricServiceSettings =
      MetricServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  MetricServiceClient metricServiceClient =
      MetricServiceClient.create(metricServiceSettings);

  To customize the endpoint:



  MetricServiceSettings metricServiceSettings =
      MetricServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  MetricServiceClient metricServiceClient =
      MetricServiceClient.create(metricServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 MetricServiceClient]))

(defn *create
  "Constructs an instance of MetricServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.monitoring.v3.MetricServiceSettings`

  returns: `com.google.cloud.monitoring.v3.MetricServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.MetricServiceClient [^com.google.cloud.monitoring.v3.MetricServiceSettings settings]
    (MetricServiceClient/create settings))
  (^com.google.cloud.monitoring.v3.MetricServiceClient []
    (MetricServiceClient/create )))

(defn list-metric-descriptors
  "Lists metric descriptors that match a filter. This method does not require a Stackdriver
   account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     for (MetricDescriptor element : metricServiceClient.listMetricDescriptors(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The project on which to execute the request. The format is `\"projects/{project_id_or_number}\"`. - `com.google.monitoring.v3.ProjectName`

  returns: `com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse [^MetricServiceClient this ^com.google.monitoring.v3.ProjectName name]
    (-> this (.listMetricDescriptors name))))

(defn create-time-series
  "Creates or adds data to one or more time series. The response is empty if all time series in
   the request were written. If any time series could not be written, a corresponding failure
   message is included in the error response.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     List<TimeSeries> timeSeries = new ArrayList<>();
     metricServiceClient.createTimeSeries(name, timeSeries);
   }

  name - The project on which to execute the request. The format is `\"projects/{project_id_or_number}\"`. - `com.google.monitoring.v3.ProjectName`
  time-series - The new data to be added to a list of time series. Adds at most one data point to each of several time series. The new data point must be more recent than any other point in its time series. Each `TimeSeries` value must fully specify a unique time series by supplying all label values for the metric and the monitored resource. - `java.util.List`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^MetricServiceClient this ^com.google.monitoring.v3.ProjectName name ^java.util.List time-series]
    (-> this (.createTimeSeries name time-series)))
  ([^MetricServiceClient this ^com.google.monitoring.v3.CreateTimeSeriesRequest request]
    (-> this (.createTimeSeries request))))

(defn get-metric-descriptor-callable
  "Gets a single metric descriptor. This method does not require a Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MetricDescriptorName name = MetricDescriptorName.of(\"[PROJECT]\", \"[METRIC_DESCRIPTOR]\");
     GetMetricDescriptorRequest request = GetMetricDescriptorRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<MetricDescriptor> future = metricServiceClient.getMetricDescriptorCallable().futureCall(request);
     // Do something
     MetricDescriptor response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.getMetricDescriptorCallable))))

(defn list-monitored-resource-descriptors
  "Lists monitored resource descriptors that match a filter. This method does not require a
   Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     for (MonitoredResourceDescriptor element : metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The project on which to execute the request. The format is `\"projects/{project_id_or_number}\"`. - `com.google.monitoring.v3.ProjectName`

  returns: `com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse [^MetricServiceClient this ^com.google.monitoring.v3.ProjectName name]
    (-> this (.listMonitoredResourceDescriptors name))))

(defn get-settings
  "returns: `com.google.cloud.monitoring.v3.MetricServiceSettings`"
  (^com.google.cloud.monitoring.v3.MetricServiceSettings [^MetricServiceClient this]
    (-> this (.getSettings))))

(defn list-metric-descriptors-paged-callable
  "Lists metric descriptors that match a filter. This method does not require a Stackdriver
   account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListMetricDescriptorsPagedResponse> future = metricServiceClient.listMetricDescriptorsPagedCallable().futureCall(request);
     // Do something
     for (MetricDescriptor element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMetricDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listMetricDescriptorsPagedCallable))))

(defn list-time-series-callable
  "Lists time series that match a filter. This method does not require a Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     TimeInterval interval = TimeInterval.newBuilder().build();
     ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
     ListTimeSeriesRequest request = ListTimeSeriesRequest.newBuilder()
       .setName(name.toString())
       .setFilter(filter)
       .setInterval(interval)
       .setView(view)
       .build();
     while (true) {
       ListTimeSeriesResponse response = metricServiceClient.listTimeSeriesCallable().call(request);
       for (TimeSeries element : response.getTimeSeriesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.monitoring.v3.ListTimeSeriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listTimeSeriesCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.MetricServiceStub`"
  ([^MetricServiceClient this]
    (-> this (.getStub))))

(defn list-time-series
  "Lists time series that match a filter. This method does not require a Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     TimeInterval interval = TimeInterval.newBuilder().build();
     ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
     for (TimeSeries element : metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The project on which to execute the request. The format is \"projects/{project_id_or_number}\". - `com.google.monitoring.v3.ProjectName`
  filter - A [monitoring filter](/monitoring/api/v3/filters) that specifies which time series should be returned. The filter must specify a single metric type, and can additionally specify metric labels and other information. For example: metric.type = \"compute.googleapis.com/instance/cpu/usage_time\" AND metric.label.instance_name = \"my-instance-name\" - `java.lang.String`
  interval - The time interval for which results should be returned. Only time series that contain data points in the specified interval are included in the response. - `com.google.monitoring.v3.TimeInterval`
  view - Specifies which information is returned about the time series. - `com.google.monitoring.v3.ListTimeSeriesRequest$TimeSeriesView`

  returns: `com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse [^MetricServiceClient this ^com.google.monitoring.v3.ProjectName name ^java.lang.String filter ^com.google.monitoring.v3.TimeInterval interval ^com.google.monitoring.v3.ListTimeSeriesRequest$TimeSeriesView view]
    (-> this (.listTimeSeries name filter interval view)))
  (^com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse [^MetricServiceClient this ^com.google.monitoring.v3.ListTimeSeriesRequest request]
    (-> this (.listTimeSeries request))))

(defn list-metric-descriptors-callable
  "Lists metric descriptors that match a filter. This method does not require a Stackdriver
   account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListMetricDescriptorsResponse response = metricServiceClient.listMetricDescriptorsCallable().call(request);
       for (MetricDescriptor element : response.getMetricDescriptorsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMetricDescriptorsRequest,com.google.monitoring.v3.ListMetricDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listMetricDescriptorsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^MetricServiceClient this]
    (-> this (.isShutdown))))

(defn delete-metric-descriptor
  "Deletes a metric descriptor. Only user-created [custom metrics](/monitoring/custom-metrics) can
   be deleted.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MetricDescriptorName name = MetricDescriptorName.of(\"[PROJECT]\", \"[METRIC_DESCRIPTOR]\");
     metricServiceClient.deleteMetricDescriptor(name);
   }

  name - The metric descriptor on which to execute the request. The format is `\"projects/{project_id_or_number}/metricDescriptors/{metric_id}\"`. An example of `{metric_id}` is: `\"custom.googleapis.com/my_test_metric\"`. - `com.google.monitoring.v3.MetricDescriptorName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^MetricServiceClient this ^com.google.monitoring.v3.MetricDescriptorName name]
    (-> this (.deleteMetricDescriptor name))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^MetricServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^MetricServiceClient this]
    (-> this (.shutdown))))

(defn create-metric-descriptor-callable
  "Creates a new metric descriptor. User-created metric descriptors define [custom
   metrics](/monitoring/custom-metrics).

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
     CreateMetricDescriptorRequest request = CreateMetricDescriptorRequest.newBuilder()
       .setName(name.toString())
       .setMetricDescriptor(metricDescriptor)
       .build();
     ApiFuture<MetricDescriptor> future = metricServiceClient.createMetricDescriptorCallable().futureCall(request);
     // Do something
     MetricDescriptor response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateMetricDescriptorRequest,com.google.api.MetricDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.createMetricDescriptorCallable))))

(defn close
  ""
  ([^MetricServiceClient this]
    (-> this (.close))))

(defn get-metric-descriptor
  "Gets a single metric descriptor. This method does not require a Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MetricDescriptorName name = MetricDescriptorName.of(\"[PROJECT]\", \"[METRIC_DESCRIPTOR]\");
     MetricDescriptor response = metricServiceClient.getMetricDescriptor(name);
   }

  name - The metric descriptor on which to execute the request. The format is `\"projects/{project_id_or_number}/metricDescriptors/{metric_id}\"`. An example value of `{metric_id}` is `\"compute.googleapis.com/instance/disk/read_bytes_count\"`. - `com.google.monitoring.v3.MetricDescriptorName`

  returns: `com.google.api.MetricDescriptor`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.api.MetricDescriptor [^MetricServiceClient this ^com.google.monitoring.v3.MetricDescriptorName name]
    (-> this (.getMetricDescriptor name))))

(defn create-metric-descriptor
  "Creates a new metric descriptor. User-created metric descriptors define [custom
   metrics](/monitoring/custom-metrics).

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
     MetricDescriptor response = metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   }

  name - The project on which to execute the request. The format is `\"projects/{project_id_or_number}\"`. - `com.google.monitoring.v3.ProjectName`
  metric-descriptor - The new [custom metric](/monitoring/custom-metrics) descriptor. - `com.google.api.MetricDescriptor`

  returns: `com.google.api.MetricDescriptor`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.api.MetricDescriptor [^MetricServiceClient this ^com.google.monitoring.v3.ProjectName name ^com.google.api.MetricDescriptor metric-descriptor]
    (-> this (.createMetricDescriptor name metric-descriptor)))
  (^com.google.api.MetricDescriptor [^MetricServiceClient this ^com.google.monitoring.v3.CreateMetricDescriptorRequest request]
    (-> this (.createMetricDescriptor request))))

(defn list-monitored-resource-descriptors-paged-callable
  "Lists monitored resource descriptors that match a filter. This method does not require a
   Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> future = metricServiceClient.listMonitoredResourceDescriptorsPagedCallable().futureCall(request);
     // Do something
     for (MonitoredResourceDescriptor element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "Lists monitored resource descriptors that match a filter. This method does not require a
   Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListMonitoredResourceDescriptorsResponse response = metricServiceClient.listMonitoredResourceDescriptorsCallable().call(request);
       for (MonitoredResourceDescriptor element : response.getResourceDescriptorsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^MetricServiceClient this]
    (-> this (.isTerminated))))

(defn create-time-series-callable
  "Creates or adds data to one or more time series. The response is empty if all time series in
   the request were written. If any time series could not be written, a corresponding failure
   message is included in the error response.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     List<TimeSeries> timeSeries = new ArrayList<>();
     CreateTimeSeriesRequest request = CreateTimeSeriesRequest.newBuilder()
       .setName(name.toString())
       .addAllTimeSeries(timeSeries)
       .build();
     ApiFuture<Void> future = metricServiceClient.createTimeSeriesCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateTimeSeriesRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.createTimeSeriesCallable))))

(defn get-monitored-resource-descriptor-callable
  "Gets a single monitored resource descriptor. This method does not require a Stackdriver
   account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of(\"[PROJECT]\", \"[MONITORED_RESOURCE_DESCRIPTOR]\");
     GetMonitoredResourceDescriptorRequest request = GetMonitoredResourceDescriptorRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<MonitoredResourceDescriptor> future = metricServiceClient.getMonitoredResourceDescriptorCallable().futureCall(request);
     // Do something
     MonitoredResourceDescriptor response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,com.google.api.MonitoredResourceDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.getMonitoredResourceDescriptorCallable))))

(defn delete-metric-descriptor-callable
  "Deletes a metric descriptor. Only user-created [custom metrics](/monitoring/custom-metrics) can
   be deleted.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MetricDescriptorName name = MetricDescriptorName.of(\"[PROJECT]\", \"[METRIC_DESCRIPTOR]\");
     DeleteMetricDescriptorRequest request = DeleteMetricDescriptorRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = metricServiceClient.deleteMetricDescriptorCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteMetricDescriptorRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.deleteMetricDescriptorCallable))))

(defn list-time-series-paged-callable
  "Lists time series that match a filter. This method does not require a Stackdriver account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     String filter = \"\";
     TimeInterval interval = TimeInterval.newBuilder().build();
     ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.FULL;
     ListTimeSeriesRequest request = ListTimeSeriesRequest.newBuilder()
       .setName(name.toString())
       .setFilter(filter)
       .setInterval(interval)
       .setView(view)
       .build();
     ApiFuture<ListTimeSeriesPagedResponse> future = metricServiceClient.listTimeSeriesPagedCallable().futureCall(request);
     // Do something
     for (TimeSeries element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListTimeSeriesRequest,com.google.cloud.monitoring.v3.MetricServiceClient$ListTimeSeriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MetricServiceClient this]
    (-> this (.listTimeSeriesPagedCallable))))

(defn shutdown-now
  ""
  ([^MetricServiceClient this]
    (-> this (.shutdownNow))))

(defn get-monitored-resource-descriptor
  "Gets a single monitored resource descriptor. This method does not require a Stackdriver
   account.

   Sample code:



   try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
     MonitoredResourceDescriptorName name = MonitoredResourceDescriptorName.of(\"[PROJECT]\", \"[MONITORED_RESOURCE_DESCRIPTOR]\");
     MonitoredResourceDescriptor response = metricServiceClient.getMonitoredResourceDescriptor(name);
   }

  name - The monitored resource descriptor to get. The format is `\"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}\"`. The `{resource_type}` is a predefined type, such as `cloudsql_database`. - `com.google.monitoring.v3.MonitoredResourceDescriptorName`

  returns: `com.google.api.MonitoredResourceDescriptor`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.api.MonitoredResourceDescriptor [^MetricServiceClient this ^com.google.monitoring.v3.MonitoredResourceDescriptorName name]
    (-> this (.getMonitoredResourceDescriptor name))))


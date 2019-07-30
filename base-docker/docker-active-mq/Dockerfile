FROM larrytalley/activemq-docker-image

MAINTAINER Venkatesh Nittur <nittur.Venkatesh@gmail.com>

ENV ACTIVEMQ_NAME messagebus1 \
    ACTIVEMQ_REMOVE_DEFAULT_ACCOUNT true \
    ACTIVEMQ_ADMIN_LOGIN admin \
    ACTIVEMQ_ADMIN_PASSWORD admin \
    ACTIVEMQ_WRITE_LOGIN producer \
    ACTIVEMQ_WRITE_PASSWORD producer \
    ACTIVEMQ_READ_LOGIN consumer \
    ACTIVEMQ_READ_PASSWORD consumer \
    ACTIVEMQ_JMX_LOGIN jmx \
    ACTIVEMQ_JMX_PASSWORD jmx \
    ACTIVEMQ_STATIC_TOPICS log;auth;akfish \
    ACTIVEMQ_STATIC_QUEUES queue1;queue2;queue3 \
    ACTIVEMQ_MIN_MEMORY 512 \
    ACTIVEMQ_MAX_MEMORY 2048 \
    ACTIVEMQ_ENABLED_SCHEDULER true

CMD ["/bin/sh", "-c", "$ACTIVEMQ_HOME/bin/activemq console"]
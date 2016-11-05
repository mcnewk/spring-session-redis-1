FROM centos:7

MAINTAINER foo

# install curl
RUN yum -y install curl

# Add EPEL repo
RUN yum -y install epel-release

# install nginx
RUN yum -y install nginx

# Remove the default Nginx configuration file
RUN rm -v /etc/nginx/nginx.conf

# Copy a configuration file from the current directory
COPY ./nginx.conf /etc/nginx/

# Expose ports
EXPOSE 80

# show the version and compile the config
RUN /usr/sbin/nginx -V

# Set the default command to execute
# when creating a new container
CMD /usr/sbin/nginx -g "daemon off;"

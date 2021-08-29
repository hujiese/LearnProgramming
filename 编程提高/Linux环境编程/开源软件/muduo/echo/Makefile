CFLAGS = -g -Wall -I /mnt/hgfs/vmshare/OpenSource/muduo/build/debug-install/include
LIBS = -L /mnt/hgfs/vmshare/OpenSource/muduo/build/debug-install/lib -lmuduo_base -lmuduo_net -lpthread

SRCS = main.cc echo.cc
OBJS = $(SRCS:.cc=.o)
EXECUTABLE = echo
CC = g++

all:
	$(CC) $(CFLAGS) -o $(EXECUTABLE) $(SRCS) $(LIBS)

.PHONY:clean
clean:
	rm $(EXECUTABLE) $(OBJS)

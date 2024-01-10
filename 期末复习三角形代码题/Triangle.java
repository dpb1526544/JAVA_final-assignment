public class Triangle {
    public static void main(String args[]) {
        System.out.println("----打印三角形----");
        int h = 9;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("----打印三角形包裹数字---");
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1 || i == h) System.out.print("*");
                else {
                    if (k == 1 || k == 2 * i - 1) System.out.print("*");
                    else System.out.print(i - 1);
                }
            }
            System.out.println();
        }
        System.out.println("----打印三角形数字边边---");
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1 || i == h) System.out.print(i);
                else {
                    if (k == 1 || k == 2 * i - 1) System.out.print(i);
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----朴素菱形---");
        int mid = h / 2 + 1;
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----数字边边菱形---");
        int mid1 = h / 2 + 1;
        for (int i = 1; i <= mid1; i++) {
            for (int j = 1; j <= mid1 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        int temp = mid1 + 1;
        for (int i = mid1 - 1; i >= 1; i--) {
            for (int j = 1; j <= mid1- i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print(temp);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(temp);
                    else {
                        System.out.print(" ");
                    }
                }
            }
            temp++;
            System.out.println();
        }

        System.out.println("----数字包星星菱形---");
        for (int i = 1; i <= mid1; i++) {
            for (int j = 1; j <= mid1 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        int temp1 = mid1 + 1;
        for (int i = mid1 - 1; i >= 1; i--) {
            for (int j = 1; j <= mid1 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print(temp1);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(temp1);
                    else {
                        System.out.print("*");
                    }
                }
            }
            temp1++;
            System.out.println();
        }

        System.out.println("----星星包数字菱形---");
        for (int i = 1; i <= mid1; i++) {
            for (int j = 1; j <= mid1 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else {
                        System.out.print(i - 1);
                    }
                }
            }
            System.out.println();
        }
        int temp2 = mid1 + 1;
        for (int i = mid1 - 1; i >= 1; i--) {
            for (int j = 1; j <= mid1 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else {
                        System.out.print(temp2 - 1);
                    }
                }
            }
            temp2++;
            System.out.println();
        }

        System.out.println("----朴素沙漏---");
        int mid2 = h / 2 + 1;
        for (int i = mid2; i >= 1; i--) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= mid2; i++) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----数字边沙漏---");
        for (int i = mid2; i >= 1; i--) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= mid2; i++) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("----数字边包星星沙漏---");
        for (int i = mid2; i >= 1; i--) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= mid2; i++) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print(i);
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print(i);
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("----星星边包数字沙漏---");
        for (int i = mid2; i >= 1; i--) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print("*");
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= mid2; i++) {
            for (int j = 1; j <= mid2 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == mid2) {
                    System.out.print("*");
                } else {
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }
}